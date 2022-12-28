package io;
import java.io.FileOutputStream;

/**
 * 文件的输出流--写操作
 */
public class FOSDemo {
    public static void main(String[] args) throws Exception {
        /*
        文件流输出流在创建时，
        若指定路径下文件不存在时，系统会直接创建文件
        但是文件目录必须存在
        */
        FileOutputStream fos=new FileOutputStream("./fos.dat");
        for (int i = 0; i < 26; i++) {
            fos.write(65+i);
        }
        System.out.println("写入完毕");
        fos.close();
    }
}
