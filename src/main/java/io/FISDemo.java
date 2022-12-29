package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流---读操作
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file/fos.dat");
        System.out.println(fis.read());
        System.out.println(fis.read());

    }
}
