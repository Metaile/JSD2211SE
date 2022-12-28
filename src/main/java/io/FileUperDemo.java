package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 创建一个文件t.txt
 * 向文件中写入控制台输入的类容，并读取出来
 */
public class FileUperDemo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        File file = new File("note.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        FileInputStream fis = new FileInputStream(file);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("文件创建完毕!");
        } else {
            System.out.println("文件已存在");
        }
        System.out.print("输入内容:");
        fos.write(scan.next().getBytes(StandardCharsets.UTF_8));
        System.out.println("写入完毕");
        byte[] bytes = new byte[(int) file.length()];
        fis.read(bytes);
        System.out.println("读取完毕");
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("文本内容:" + s);
        fis.close();
        fos.close();
    }
}
