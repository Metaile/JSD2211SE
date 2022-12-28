package practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("t.txt");
        FileOutputStream fos=new FileOutputStream("t_cp.txt");
        byte[] data=new byte[1024*10];
        int len;
        long start=System.currentTimeMillis();
        while ((len = fis.read(data)) != -1){
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！耗时:" + (end - start)+"ms");
    }
}
