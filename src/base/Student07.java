package base;

public class Student07 {
    private String name;
    private int age;
    public Student07(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String read(){
        return "我是"+name+",年龄："+age;
    }
}
