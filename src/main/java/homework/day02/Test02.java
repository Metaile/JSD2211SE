package homework.day02;


import java.io.*;

/**
 * 改正下面程序的错误
 * <p>
 * 程序实现需求:使用缓冲流完成文件的复制操作
 *
 * @author Xiloer
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("test_cp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        long start=System.currentTimeMillis();
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bos.flush();
        long end=System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        bos.close();
        bis.close();
    }
}