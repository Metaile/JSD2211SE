package homework.day01;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用在控制台输入一个目录名，然后将当前项目目录下的这个目录删除。（只要求删除Test03创建的空目录）
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入目录名:");
        File dir = new File(scan.next());
        if (dir.exists()) {
            dir.delete();
            System.out.println("目录删除成功");
        }
    }
}
