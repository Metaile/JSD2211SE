package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前目录下创建10个文件，名字为test1.txt----test10.txt
 */
public class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            File file = new File("test"+i+".txt");
            if(file.exists()){
                System.out.println("文件已存在");
            }else {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("文件已创建");
            }
        }

    }
}
