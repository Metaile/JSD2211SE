package practice.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流--读操作
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./t.txt");
        /*int read()返回数据字节*/
        fis.read();
        System.out.println("读取完毕");
    }
}
