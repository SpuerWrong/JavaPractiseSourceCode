package method;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className Learn01
 * @package method
 * @description 方法介绍示例
 */
public class LearnMethod01 {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        star();
        int a = 12;
        int b = 23;
        System.out.println(max(a,b));
    }

    public static int add(int a, int b){
//这就是一个方法。
        return a+b;
    }
    public static void star(){
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
    //两个数取大数的方法。
    public static int max(int a, int b){
        if(a==b){
            return 0;//如果a等于b,那么返回0，return除了可以返回参数外，还可以中止方法。
        }
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}
