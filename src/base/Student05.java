package base;

public class Student05 {
    private String name;
    private int age;
    public Student05(){
        System.out.println("调用了一个无参的构造方法");
    }
    public Student05(String n){
        name = n;
        System.out.println("调用了一个参数的构造方法");
    }
    public Student05(String n,int a){
        name = n;
        age = a;
        System.out.println("调用了两个参数的构造方法");
    }
    public void read(){
        System.out.println("我是"+name+",年龄："+age);
    }
}
