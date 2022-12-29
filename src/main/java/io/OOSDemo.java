package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象输出流进行对象序列化操作
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="天天学习";
        int age=22;
        String gender="好好向上";
        String[] otherInfo={"娃哈哈","真不错","欧耶"};
        Person person=new Person(name,age,gender,otherInfo);
        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(person);
        System.out.println("写入完成");
        oos.close();
    }
}
