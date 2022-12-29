package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            String line="";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            /*
            可以有多个catch
            如果针对try中多个异常处理方法相同时，可以合并到一个catch中解决来复用解决办法
             */
        } catch (NullPointerException|StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("一起解决，终止！");
        }
        System.out.println("结束");
    }
}
