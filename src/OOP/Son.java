package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Son
 * @package OOP
 * @description 子类，继承自父类
 */
public class Son extends Father{
    private String name = "子类的名字";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
