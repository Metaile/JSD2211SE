package file;

import java.io.File;

/**
 * java.io.File类
 * 绝对路径：文件系统规定的根目录
 * 相对路径：常见的相对路径 “./” ：表示当前目录（IDEA中“./”就是当前项目目录）
 */
public class FileDemo {
    public static void main(String[] args) {
        File file=new File("./demo.txt");
        /*String s   .getName() 获取文件名*/
        System.out.println(file.getName());
        /*long l    .length()  获取文件字节量*/
        System.out.println(file.length());
        /*boolean   .canRead()是否可读*/
        System.out.println(file.canRead());
        /*boolean   .canWrite()是否可写*/
        System.out.println(file.canWrite());
        /*boolean   .isHidden()是否隐藏*/
        System.out.println(file.isHidden());



    }
}
