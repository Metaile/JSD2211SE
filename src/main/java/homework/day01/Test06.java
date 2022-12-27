package homework.day01;

import java.io.File;

/**
 * 列出当前目录中所有名字包含s的子项。
 * <p>
 * 使用匿名内部类和lambda两种写法
 * <p>
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 * @author Xiloer
 */
public class Test06 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles(file -> file.getName().contains("s"));
            for (File sub : subs) {
                System.out.println(sub.getName());
            }
            /*FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("s");
                }
            };
            File[] subs = dir.listFiles(filter);
            for (File sub : subs) {
                System.out.println(sub.getName());
            }*/
        }
    }
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【创建文件对象】
	File dir = new File(".");

	//【创建文件数组接收过滤后的文件】
	File[] suns = dir.listFiles(new FileFilter() {
		public boolean accept(File file) {

		}
	});

	//【判断对象是否是目录】
	if(dir.isDirectory()){

	}

	//【输出目录名】
	System.out.println(subs[i].getName());

	//【返回包含s的目录名】
	return file.getName().contains("s");

	//【遍历数组】
	for(int i=0;i<subs.length;i++){

	}



 */