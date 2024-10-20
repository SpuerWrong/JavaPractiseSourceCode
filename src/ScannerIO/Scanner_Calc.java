package ScannerIO;

import java.util.Scanner;

/**
 * @author 王丽杰
 * @date 2024/10/18
 * @className Scanner_Calc
 * @package ScannerIO
 * @description 用简单的ScannerIO流制作的简单的计算器i
 */
public class Scanner_Calc {
    int i = 0;
    double x = 0.0;
    double sum =0.0;
    double sub = 0.0;
    double mul = 0.0;
    double div = 0.0;
    public double addMath(double number){
        double x = number;
        sum = sum + x;
        return sum;
    }
    public double subtractionMath(double number){
        if(sub==0){
            sub = number;
        }else{
            sub = sub - number;
        }
        return sub;
    }
    public double multiplicationMath(double number){
        if(mul==0){
            mul = number;
        }else{
        mul = mul / number;
        }
        return mul;
    }
    public double divisionMath(double number){
        if(div == 0){
            div = number;
        }else{
            div = div * number;
        }
        return div;
    }
    public void description(){
        System.out.println("欢迎打开Scanner流计算器");
        System.out.println("请输入操作类型");
        System.out.println("1.加法");
        System.out.println("2.减法");
        System.out.println("3.除法");
        System.out.println("4.乘法");
    }


    public static void main(String[] args) {
        Scanner_Calc calc = new Scanner_Calc();
        Scanner number = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        calc.description();
        int i = number.nextInt();
        while(i!=0)
        if(i<5&&i>0){
            switch (i) {
                case 1:
                    System.out.println("输入数字进行加法运算，输入非数字进行最终结算");
                    while (scan.hasNextDouble()) {
                        double sum = calc.addMath(scan.nextDouble());
                        System.out.println("当前合计为：" + sum);
                    }
                    System.out.println("当前总和为："+calc.sum);
                    break;
                case 2:
                    System.out.println("输入数字进行减法运算，输入非数字进行最终结算");
                    while(scan.hasNextDouble()){
                        double sub =calc.subtractionMath(scan.nextDouble());
                        System.out.println("当前计算结果为："+sub);
                    }
                    System.out.println("最终减法运算结果为："+calc.sub);
                    break;
                case 3:
                    System.out.println("输入数字进行除法运算，输入非数字进行最终结算");
                    while(scan.hasNextDouble()){
                        double mul = calc.multiplicationMath(scan.nextDouble());
                        System.out.println("当前计算结果为："+mul);
                    }
                    System.out.println("最终除法运算结果为："+calc.mul);
                    break;
                case 4:
                    System.out.println("输入数字进行乘法运算，输入非数字进行最终结算");
                    while(scan.hasNextDouble()){
                        double div = calc.divisionMath(scan.nextDouble());
                        System.out.println("当前计算结果为："+div);
                    }
                    System.out.println("最终乘法运算结果为："+calc.div);
                    break;
            }
        }else{
            System.out.println("输入错误");

        }


    }
}
