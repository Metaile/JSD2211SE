package homework.day03;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 扫描指定目录中的所有.java文件，并将内容全部输出到控制台
 *
 * 例如将当前项目目录下src/main/java/io目录中的所有java文件内容输出
 * 到控制台
 *
 * 1:先要定位./src/main/java/io目录(哪个API用来描述目录?)
 * 2:获取该目录下的所有.java文件
 * 3:遍历每一个java文件，然后按行读取里面的每一行字符串
 *   并输出控制台
 *
 *
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.print("输入目录(用/分隔):");
        /*src/main/java/homework/day03*/
        String line= scan.nextLine();
        File file=new File(line);
        if(file.isDirectory()){
            File[] subs=file.listFiles(f->f.getName().endsWith(".java"));
            if (subs!=null){
                for (File sub : subs) {
                    System.out.println(sub.getName());
                    FileInputStream fis=new FileInputStream(sub);
                    InputStreamReader isr=new InputStreamReader(fis, StandardCharsets.UTF_8);
                    BufferedReader br=new BufferedReader(isr);
                    String len;
                    while ((len= br.readLine())!=null){
                        System.out.println(len);
                    }
                    br.close();
                }
            }else {
                System.out.println(line + "目录下没有.java文件");
            }
        }else {
            System.out.println(line + "未找到指定目录!");
        }
    }
}
