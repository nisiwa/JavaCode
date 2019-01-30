package com.cskaoyan.exercise;

import java.io.*;

/*
    复制单极文件夹中指定文件并修改文件名称
    数据源：e:\\demo
    目的地：d：\\copy
 */
public class Test5 {
    public static void main(String[] args) throws FileNotFoundException {
        /*BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("e:\\demo"));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("d:\\copy"));
        */
        File srcFolder = new File("e:\\demo");
        File destFolder = new File("d:\\copy");
        copyFolder(srcFolder, destFolder);
    }

    private static void copyFolder(File srcFolder, File destFolder) {
        // 判断文件夹是否存在？
        if (!destFolder.exists()) {
            // 否：创建文件夹   dest.mkdir();
            destFolder.mkdir();
        }
        // 拿到 srcFolder下的所有.java
        File[] files = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && name.endsWith(".java");
            }
        });
        // 遍历所有文件
        for (File file : files) {
            // 怎么构建copyFile
            String fileName = file.getName();
            File copyFile = new File(destFolder, fileName);

            copyFile(file, copyFile);
        }
    }

    private static void copyFile(File srcFile, File destFile){
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(srcFile));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在!");
        } catch (IOException e) {
            System.out.println("读写异常");
        }
    }
}
