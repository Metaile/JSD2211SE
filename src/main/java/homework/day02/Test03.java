package homework.day02;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将当前项目目录下的所有.txt文件复制一份。
 * 复制文件的名字格式:原文件名_cp.txt
 * <p>
 * 例如:
 * 复制当前项目目录下的demo.txt时，复制的文件名为demo_cp.txt
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File[] subs=file.listFiles(f -> f.getName().endsWith(".txt"));
        for (File sub : subs) {
            FileInputStream fis=new FileInputStream(sub);
            FileOutputStream fos=new FileOutputStream(sub.getName().substring(0,sub.getName().length()-4)+"_cp.txt");
            int len;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
            fos.close();
            fis.close();
        }
    }
}
