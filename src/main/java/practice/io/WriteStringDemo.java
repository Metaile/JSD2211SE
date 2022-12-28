package practice.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("t.txt");
        FileOutputStream fos=new FileOutputStream(file);
        fos.write("oo哈哈哈哈".getBytes(StandardCharsets.UTF_8));
        System.out.println("写入完毕");
    }
}
