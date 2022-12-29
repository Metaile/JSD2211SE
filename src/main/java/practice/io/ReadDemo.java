package practice.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("t.txt");
        FileInputStream fis=new FileInputStream(file);
        byte[] data=new byte[(int)file.length()];
        fis.read(data);
        System.out.println("读取成功");
        String s=new String(data, StandardCharsets.UTF_8);
        System.out.println(s);
        fis.close();
    }
}
