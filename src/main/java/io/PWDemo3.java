package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后，将用户在控制台上输入的每行字符串都按行写入文件note.txt中
 * 当单独输入exit时退出
 *
 * 要求：自行完成4层流连接
 */
public class PWDemo3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("file/note.txt",true);
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw);
        System.out.print("输入内容(exit退出):");
        String s= scan.nextLine();
        while (!"exit".equals(s)){
            pw.write(s);
            System.out.println("写入成功");
            s= scan.nextLine();
        }
        pw.close();
    }
}
