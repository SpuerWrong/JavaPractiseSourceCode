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
}
