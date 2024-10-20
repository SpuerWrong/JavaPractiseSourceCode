package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerForPRO
 * @package ScannerIO
 * @description 增强FOr循环
 */
public class ScannerForPRO {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};//定义了一个数组

        for(int i = 0; i<5;i++){
            System.out.println(numbers[i]);
        }
        for(int x:numbers){
            System.out.println(x);
        }
    }
}
