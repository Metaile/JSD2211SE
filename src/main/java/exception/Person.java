package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>110){
            throw new IllegalAgeException("年龄不符");
        }
        this.age = age;
    }
}
