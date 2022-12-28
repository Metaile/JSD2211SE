package practice.io;

import java.io.*;

/**
 * 缓冲流--复制
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("img.png");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("img_cp.png");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len;
        long start=System.currentTimeMillis();
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕,耗时:" + (end - start) + "ms");
        bos.close();
        bis.close();
    }
}
