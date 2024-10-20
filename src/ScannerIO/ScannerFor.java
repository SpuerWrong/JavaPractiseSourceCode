package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerFor
 * @package ScannerIO
 * @description for循环练习
 */
public class ScannerFor {
    public static void main(String[] args) {
        int a = 1 ;   //初始化条件

        while (a <= 100){
            System.out.println(a);
            a+=5;   //迭代
        }
        System.out.println("while循环结束");

        for(int i = 1;i<=100; i+=5){
            System.out.println(i);
        }
        System.out.println("for循环结束");


    }
}
