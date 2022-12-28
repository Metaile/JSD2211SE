package practice.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 从控制台写入数据，exit时退出
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("data.txt",true);
        System.out.print("输入数据(exit退出):");
        String s=scan.nextLine();
        while (!"exit".equals(s)){
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            s=scan.nextLine();
        }
        fos.close();
    }
}
