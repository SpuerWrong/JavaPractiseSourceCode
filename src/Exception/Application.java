package Exception;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Application
 * @package Exception
 * @description 自定义异常测试类
 */
public class Application {
    //可能会存在异常的方法
    static void test(int a)throws MyException{
        System.out.println("传递的参数为"+a);
        if(a>10){
            throw new MyException(a);//抛出
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
           // throw new RuntimeException(e);
            System.out.println("MyException="+e);
        }
    }
}
