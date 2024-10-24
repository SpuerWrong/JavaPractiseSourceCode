package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Polymorphism
 * @package OOP
 * @description 多态
 */
public class Polymorphism {
    public static void main(String[] args) {
        Son s1 = new Son();//能调用的方法可以是自己的自己的也可以是父类。
        Father s2 = new Son(); //父类的引用指向子类的类型, 可以指向子类但不能调用子类独有的方法
        Object s3 = new Son();
    }
}
