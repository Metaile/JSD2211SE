package practice.io;


import java.io.*;

public class OISDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis=new FileOutputStream("file/ois.txt");
        ObjectOutputStream ois=new ObjectOutputStream(fis);
        Student stu=new Student("张三",999);
        ois.writeObject(stu);
        ois.close();
    }
}
