package base;

//测试类
public class Example17 {
    public static void main(String[] args){
        System.out.println("编号:"+Animal_interface.getID());
        Dog_interface dog = new Dog_interface();
        dog.info();
        dog.shout();
        dog.eat();
    }
}
