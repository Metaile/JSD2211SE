package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeletDirDemo {
    public static void main(String[] args) {
        /*
        .delete() 删除当前目录
        删除目录时，目录必须是空目录，否则无法删除
         */
//        File dir=new File("./A");
        File dir=new File("./demo");
        if (dir.exists()) {
            dir.delete();
            System.out.println("目录已删除");
        } else {
            System.out.println("目录不存在");
        }
    }
}
