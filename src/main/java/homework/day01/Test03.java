package homework.day01;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户在控制台输入一个目录名，然后将这个目录创建在当前项目目录下
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("输入目录名:");
        File dir=new File(scan.next());
        if(!dir.exists()){
            dir.mkdirs();
            System.out.println("目录创建成功");
        }
    }
}
