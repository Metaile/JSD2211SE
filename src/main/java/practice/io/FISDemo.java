package practice.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件流--读操作
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./t.txt");
        /*int read()返回当前字符的数据字节*/
        int len=fis.read();
        System.out.println(len);
    }
}
