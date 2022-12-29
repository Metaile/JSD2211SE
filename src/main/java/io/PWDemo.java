package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流内部有一个默认为8192长度的char数组，总是以块读形式来保证书写效率
 *
 * java.io.PrintWriter
 * 具有自动行刷新功能的缓冲字符输出流,内部总是连接BufferedWriter作为缓冲使用。
 * 特点：
 * 1.可以按行写出字符串
 * 2.可选的自动行刷新功能
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("file/pw.txt");
        pw.println("真不错,");
        pw.println("lllll,");
        pw.print("吼吼，嘿嘿");
        pw.print("哈哈哈");
        System.out.println("写入成功");
        pw.close();

    }
}
