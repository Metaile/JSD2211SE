package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 冲字符输入流:java.io.BufferedReader
 * 缓冲字符输入流内部默认有一个长度为8192的char数组，块读文本数据加速。
 * 并且其还具备按行读取字符串的能力。
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file/note.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
