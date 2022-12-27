package homework.day01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * 
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 * 
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		while (true) {
			System.out.print("输入文件名:");
			File file=new File(scan.next());
			if(!file.exists()){
				file.createNewFile();
				System.out.println("文件创建成功");
				break;
			}else {
				System.out.println("文件已存在,重新输入!");
			}
		}
	}
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【新建一个扫描仪】
	Scanner scanner = new Scanner(System.in);

	//【一直循环】
	while(true){

	}

	//【创建一个字符串接收从控制台传入的值】
	String fileName = scanner.nextLine();

	//【创建一个文件对象接收】
	File file = new File(fileName);

	//【输出文件创建完毕！】
	System.out.println("文件创建完毕!");

	//【输出请输入文件名：】
	System.out.println("请输入文件名:");

	//【创建文件】
	file.createNewFile();

	//【判断文件是否存在】
	if(file.exists()){

	}else{

	}

	//【输出该文件已存在，请更换名字】
	System.out.println("该文件已存在，请更换名字");

	//【跳出循环】
	break;


 */








