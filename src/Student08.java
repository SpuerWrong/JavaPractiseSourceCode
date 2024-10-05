public class Student08 {
    private String name;
    private int age;
    public Student08(){

        System.out.println("调用了无参构造方法");

    }
    public Student08(String name,int age){
        this();
        this.name = name;
        this.age = age;
    }
    public Student08(String name){
        this(name,20);
        System.out.println("有参函数被调用了");

    }
    public String read(){
        return "我是"+name+",年龄"+age;
    }
}
