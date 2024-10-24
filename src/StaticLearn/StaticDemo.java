package StaticLearn;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className StaticDemo
 * @package StaticLearn
 * @description static介绍
 */
public class StaticDemo {
    static int age;//静态属性
    private String name;
    private double score;

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.name);
        System.out.println(staticDemo.age);
        System.out.println(age);
        System.out.println(StaticDemo.age);
    }
}
