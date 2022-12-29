package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制---块读
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file/img.png");
        FileOutputStream fos=new FileOutputStream("file/img_cp.png");
        int len=0;
        byte[] data=new byte[1024*10];
        long start=System.currentTimeMillis();
        while ((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕,耗时:" + (end - start)+"ms");
        fis.close();
        fos.close();
    }
}
