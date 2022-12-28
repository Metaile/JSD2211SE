package practice.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲流---Flush
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("t.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("哦哦哦哈哈哈嘿嘿嘿".getBytes(StandardCharsets.UTF_8));
        bos.flush();
        System.out.println("缓冲-写入完毕");
        bos.close();
    }
}
