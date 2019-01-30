package com.cskaoyan.exercise;

import java.io.*;

/*
    复制单极文件夹
        数据源：e:\\demo
        目的地：d:\\copy
    分析：
        1. 判断文件夹是否存在？
            是：
            否：创建文件夹   dest.mkdir();
        2. 拿到 srcFolder下的所有文件
            srcFolder.listFile();
        3. 遍历所有文件
        4. 复制文件
 */
public class Test4 {
    public static void main(String[] args) {
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
        // 拿到 srcFolder下的所有文件
        File[] files = srcFolder.listFiles();
        // 遍历所有文件
        for (File file : files) {
            // 怎么构建copyFile
            String fileName = file.getName();
            File copyFile = new File(destFolder, fileName);

            copyFile(file, copyFile);
        }
    }

    private static void copyFile(File srcFile, File destFile){
        /*InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(srcFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(destFile));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("读写异常");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("释放资源失败");
                }
            }
        }
    }*/
        // try with resource 如果申请了资源，最后系统一定会释放该资源，不用谢finally语句，也不用谢close()语句
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(srcFile));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destFile))) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("读写异常");
        }
    }
}
