package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * java.io.InputStream和OutputStream是所有字节输入流与输出流的超类
 * java.io.Reader和Writer则是所有字符输入流和输出流的超类
 * 字节流与字符流之间互不继承
 * 字节流是以字节（8位2进制）位最小单位读写数据
 * 字符流则是以字符（char）为最小单位读写数据
 * 因此字符流仅用来读写文本数据，且字符流都是高级流
 *
 * 转换流
 * InputStreamReader和OutputStreamWriter
 *
 * 字符输出流
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("file/osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        osw.write("我们只是大自然的搬运工\n",4,7);
        osw.write("农户山泉有点甜");
        System.out.println("写入完成");
        osw.close();
    }
}
