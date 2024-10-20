package base;

public class Dog01 extends Animal02{
    //重写父类Animal的shot()方法
    void shot(){
        super.shot();
        System.out.println("汪汪汪");
    }
    public void setName(){
        System.out.println("名字："+super.name);
    }
}
