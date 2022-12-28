package practice.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 文件输出流----写操作
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("./t.txt");
        fos.write("哈哈哈哈---".getBytes(StandardCharsets.UTF_8));
        System.out.println("写入完毕");
    }
}
