package file;

import java.io.File;

/**
 * 获取目录中的所有子项
 */
public class ListFileDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        /*
        boolean isFile()
        判断当前File对象表示的是否为一个真实存在的文件
        boolean isDirectory()
        判断当前File对象表示的是否为一个真实存在的目录
         */
        if (dir.isDirectory()) {
            /*
            File[] listFiles()
            将当前File对象表示的目录所有子项获取回来
            返回的数组中每个File对象表达其中的一个子项
             */
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for (File sub : subs) {
                System.out.println(sub.getName());
            }
        }

    }
}
