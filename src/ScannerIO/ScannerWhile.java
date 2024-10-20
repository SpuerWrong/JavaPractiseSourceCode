package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerWhile
 * @package ScannerIO
 * @description while循环练习
 */
public class ScannerWhile {
    public static void main(String[] args) {
        while (true){
            //死循环
            //用于：等待客户端链接
            //用于：定期检查
            //平时开发时应尽量避免
            break;
        }
        int i =0 ;
        int sum = 0;
        while (i<=100){
            sum =sum +i;
            i++;
        }
        System.out.println(sum);
        i =  0;
        do{
            sum = sum + i;
            i++;
        }while(i<=100);
        System.out.println(sum);
    }
}
