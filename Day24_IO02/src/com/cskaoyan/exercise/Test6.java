package com.cskaoyan.exercise;

import java.io.*;

/*
    复制多极文件夹
    数据源：e:\\demo
    目的地：d:\\copy
    分析：
        1. 判断File对象
            文件：
                直接复制
            目录：
                存在：
                不存在：创建目录
        2. 拿到 srcFolder下的所有文件
            srcFolder.listFile();
        3. 遍历所有文件
            是否是文件夹
                是：回到1
                否：复制文件
 */
public class Test6 {
    public static void main(String[] args) {
        File srcFolder = new File("E:\\demo");
        File destFolder = new File("D:\\copy");
        copyFolders(srcFolder, destFolder);
    }

    private static void copyFolders(File src, File dest) {
        if (src.isFile()) {
            copyFile(src, dest);
            return;
        }
        // 创建目录
        if (!dest.exists()) {
            dest.mkdir();
        }
        File[] files = src.listFiles();

        for (File file : files) {
            File file1 = new File(dest, file.getName());
            copyFolders(file, file1);
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
            System.out.println("文件不存在.");
        } catch (IOException e) {
            System.out.println("读写异常");
        }
    }
}
