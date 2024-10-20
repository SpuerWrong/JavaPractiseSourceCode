package ScannerIO;

import java.util.Scanner;

/**
 * @author 王丽杰
 * @date 2024/10/18
 * @className Scanner_Method
 * @package ScannerIO
 * @description 主要测试hasNextInt(), nextint(), hasNextFloat(), nextFloat()
 */
public class Scanner_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);


        int i = 0;
        float f = 0.0F;
        double d = 0.0;
        char c = 'a';
        String str ="NULL";

        System.out.println("请输入一个整数");
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        }else{
            System.out.println("错误，输入的不是整数");
        }
        System.out.println("请输入一个小数");
        if(scanner2.hasNextFloat()){
            f = scanner2.nextFloat();
            System.out.println(f);
        }else{
            System.out.println("错误，输入的不是小数");
        }
        System.out.println("请输入一个小鼠");
        if(scanner3.hasNextDouble()){
            d = scanner3.nextDouble();
            System.out.println(d);
        }else{
            System.out.println("错误");
        }
        System.out.println("请输入一个单词");
        if(scanner4.hasNext()){
            str = scanner4.next();
            System.out.println(str);
        }else{
            System.out.println("error");
        }
        System.out.println("请输入一个句子");
        if (scanner5.hasNextLine()){
            str = scanner5.nextLine();
            System.out.println(str);
        }

        System.out.println("请输入一个字母");
        if(scanner6.hasNext()){
         //   c = (char)scanner6.next();报错：无法转换
            c = scanner6.next().charAt(0);//读取输入字符串的第一个字符
            System.out.println(c);
        }

        scanner.close();
        scanner2.close();
        scanner3.close();
        scanner4.close();
        scanner5.close();
        scanner6.close();
    }
}
