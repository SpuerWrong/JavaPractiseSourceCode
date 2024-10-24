package StaticLearn;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className StaticCode
 * @package StaticLearn
 * @description 代码块
 */
public class StaticCode {
    {
        System.out.println("匿名代码块");
        //匿名代码块
    }
    static{
        //静态代码块
        System.out.println("静态代码块");
    }
    public StaticCode (){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new StaticCode();
    }
}
