package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 字符输入流
 */
public class ISRDmeo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int len;
        while ((len = isr.read())!=-1) {
            char c=(char)len;
            System.out.print(c);
        }
        isr.close();
    }
}
