package base;

//定义Dog类继承Action接口
public class Dog_interface implements Action{
    public void eat(){
        System.out.println("喜欢吃史");
    }
    public void shout(){
        System.out.println("汪汪");
    }
    public void info(){
        System.out.println("名称："+NAME);
    }
    public void black(){
        System.out.println("黑色");
    }
}
