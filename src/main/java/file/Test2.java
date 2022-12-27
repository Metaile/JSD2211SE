package file;

import java.io.File;
import java.util.Scanner;

/**
 * 在控制台输入一个文件名，然后将当前目录下对应的文件删除
 * 比如:在控制台上输入"test1.txt",程序就将当前目录下的test1.txt删除，如果该文件不存在
 * 则提示即可。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入想要删除的文件名:");
        String fileName=scan.next();
        File file = new File(fileName+".txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }
    }
}
