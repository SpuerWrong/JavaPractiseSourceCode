package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerFor03
 * @package ScannerIO
 * @description 打印九九乘法表
 */
public class ScannerFor03 {
    public static void main(String[] args) {
        for(int i = 1 ; i < 10;i++){
            for(int j = 1;j<=i; j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
