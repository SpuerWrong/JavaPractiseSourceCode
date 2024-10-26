package Exception;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Demo2
 * @package Exception
 * @description 实例
 */
public class Demo2 {


    public static void main(String[] args) {
        int a =  1;
        int b = 0;
      //  Demo2 demo2 = new Demo2();
      //  demo2.test(a,b);
        try {
            new Demo2().test(a,b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

//主动抛异常，一般用在方法中
    //假设在方法中，处理不了这个异常。可以在方法上抛出异常
    public void test(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }

}

