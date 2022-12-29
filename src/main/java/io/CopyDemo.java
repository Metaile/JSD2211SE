package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file/test.txt");
        FileOutputStream fos = new FileOutputStream("file/test_copy.txt");
        //记录每次读取到的字节
        int f;
        long start=System.currentTimeMillis();
        while ((f = fis.read()) != -1) {
            fos.write(f);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕!耗时:" + (end - start)+"ms");
        fis.close();
        fos.close();
    }
}
