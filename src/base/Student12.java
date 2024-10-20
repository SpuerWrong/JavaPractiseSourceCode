package base;

public class Student12 {
    String name;
    {
        System.out.println("我是构造代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
    public Student12(){

        System.out.println("我是student类的构造方法");
    }

}
