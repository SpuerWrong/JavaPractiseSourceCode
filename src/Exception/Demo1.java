package Exception;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Demo1
 * @package Exception
 * @description 实例
 */
public class Demo1 {
    public static void main(String[] args) {
        int a =1;
        int b = 0;
        try {
            if(b==0){
                throw new ArithmeticException();//throw可以主动抛出异常
            }
            System.out.println(a/b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
