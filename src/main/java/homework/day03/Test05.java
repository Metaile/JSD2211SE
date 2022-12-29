package homework.day03;

import java.io.*;

/**
 * 将Test01当前目录下的所有注册的User对象对应的obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序列化后的User对象即可)
 *
 * @author Xiloer
 */
public class Test05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(".");
        File[] subs = file.listFiles(f -> f.getName().endsWith(".obj"));
        for (File sub : subs) {
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            System.out.println(user);
            ois.close();
        }
    }
}

