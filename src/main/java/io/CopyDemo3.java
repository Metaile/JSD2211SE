package io;

import java.io.*;

/**
 * 缓冲流
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file/img.png");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("file/img_cp2.png");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        long start=System.currentTimeMillis();
        int len;
        while ((len=bis.read())!=-1) {
            bos.write(len);
        }
        /*byte[] data=new byte[1024*10];
        while ((len=bis.read(data))!=-1){
            bos.write(data,0,len);
        }*/
        long end=System.currentTimeMillis();
        System.out.println("over,耗时:"+(end-start)+"ms");
        bos.close();
        bis.close();
    }
}
