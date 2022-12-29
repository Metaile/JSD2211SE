package practice.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("t.txt");
        FileOutputStream fos=new FileOutputStream(file);
        fos.write("qwer哈哈哈嘿嘿嘿或".getBytes(StandardCharsets.UTF_8));
        System.out.println("写入成功");
        fos.close();
    }
}
