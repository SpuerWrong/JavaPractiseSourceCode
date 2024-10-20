package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerFor01
 * @package ScannerIO
 * @description 计算0-100之间的奇数和偶数的和
 */
public class ScannerFor01 {
    public static void main(String[] args) {
        int sumO = 0;
        int sumJ = 0;
        for(int i = 0; i<=100 ;i++){
            if(i%2==0) {
                System.out.println(i);
                sumO += i;
            }

        }
        System.out.println("偶数和为："+sumO);
        for(int i = 0; i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
                sumJ +=i;
            }

        }
        System.out.println("奇数和为："+sumJ);
    }
}
