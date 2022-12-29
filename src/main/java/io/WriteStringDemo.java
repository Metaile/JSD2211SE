package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 项文件写入字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("file/test.txt");
        String s="娃哈哈!";
        byte[] data=s.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write("娃哈哈真好喝!".getBytes(StandardCharsets.UTF_8));
        System.out.println("写入完毕");
        fos.close();
    }
}
