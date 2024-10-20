package base;

public class Student04 {
    private String name;
    private int age;
    public Student04(String a,int c){
        name = a;
        age = c;
        System.out.println("调用了有参构造方法");
    }
    public void read(){
        System.out.println("我是："+name+",年龄"+age);
    }
}
