package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲输出流写出数据的缓冲问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("t.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("哇哈哈哈".getBytes(StandardCharsets.UTF_8));
        bos.flush();
        System.out.println("写入完毕");
        /*缓冲流关闭时会自动fulsh一次*/
        bos.close();
    }
}
