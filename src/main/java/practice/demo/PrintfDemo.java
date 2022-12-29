package practice.demo;

import java.util.Scanner;

/**
 * printf的使用
 * %n　　换行　　相当于 \n
 * %c　　单个字符
 * %d　　十进制整数
 * %u　　无符号十进制数
 * %f　　十进制浮点数
 * %o　　八进制数
 * %x　　十六进制数
 * %s　　字符串
 * %%　　输出百分号
 * > 在printf()方法中，%相当于转移符"\"
 */
public class PrintfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入产品名称:");
        String name = scan.nextLine();
        System.out.print("输入产品年限:");
        int year = scan.nextInt();
        System.out.printf("%s真不错,%d年保障", name, year);
    }
}
