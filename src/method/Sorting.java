package method;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className Sorting
 * @package method
 * @description 排序算法，用于练习可变参数
 */
public class Sorting {
    public static void printMax(double...i){
        if(i.length == 0){
            System.out.println("No argument passed");
            return;  //终止方法
        }
        double result = i[0];

        //排序
        for(int x = 1;x<i.length;x++){
            if(i[x]>result){
                result = i[x];
            }
        }
        System.out.println("the max value is"+result);
    }

    public static void main(String[] args) {
        printMax(12,34,23,54,23,123,12,2334,122,434,5436,234);
    }
}
