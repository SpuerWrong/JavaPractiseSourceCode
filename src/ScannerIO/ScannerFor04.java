package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className ScannerFor04
 * @package ScannerIO
 * @description 打印三角形
 */
public class ScannerFor04 {
    public static void main(String[] args){
        for(int i = 1; i<=5;i++){
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<i;j++){
                System.out.print("$");
            }
            System.out.println();

        }
    }
}
