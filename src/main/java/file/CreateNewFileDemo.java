package file;

import java.io.File;

/**
 * 创建文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) {
        /*在相对路径中最开始的“./”是可以忽略不写的，默认从“./”开始*/
        File file=new File("test.txt");
        /*boolean   .exists()判断当前文件是否存在*/
        if (file.exists()) {
            System.out.println("文件已存在");
        } else {
            /*.createNewFile()将当前File表示路径下将该文件创建*/
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("文件已创建");
        }

    }
}
