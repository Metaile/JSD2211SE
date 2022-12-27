package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用过滤器获取一个目录下满足过滤要求的所有子项
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles(file -> file.getName().startsWith("test"));
        for (File f : subs) {
            System.out.println(f.getName());
        }
    }
}
