package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取当前项目目录下的所有.txt文件
 */
public class Test3 {
    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter filter = file -> file.getName().contains(".txt");
        File[] subs = dir.listFiles(filter);
        for (File sub : subs) {
            System.out.println(sub.getName());
        }
    }
}
