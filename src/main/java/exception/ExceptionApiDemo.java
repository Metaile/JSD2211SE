package exception;

/**
 * 异常中常用方法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        try {
            String str="abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            //e.getMessage() 获取错误信息(提示用户)
            System.out.println(e.getMessage());
        }
    }
}
