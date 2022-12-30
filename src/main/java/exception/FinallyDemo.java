package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
//            String s=null;
            String s=" ";
            System.out.println(s.length());
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出错了");
        } finally {
            System.out.println("finally");
        }
        System.out.println("结束");
    }
}
