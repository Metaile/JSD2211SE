package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setAge(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("年龄:" + p.getAge());
    }
}
