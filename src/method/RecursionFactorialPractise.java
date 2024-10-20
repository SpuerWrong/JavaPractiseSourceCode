package method;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className RecursionFactorialPractise
 * @package method
 * @description 阶乘的计算-关于递归的运用
 */
public class RecursionFactorialPractise {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static double factorial(double n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
