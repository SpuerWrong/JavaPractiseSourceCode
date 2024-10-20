package ScannerIO;

import java.util.Scanner;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className Demo02
 * @package ScannerIO
 * @description 练习
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(scanner.equals("Hello")){
            System.out.println(a);
        }
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入错误");
        }
        scanner.close();
    }
}
