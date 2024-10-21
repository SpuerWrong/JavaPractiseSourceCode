package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className ArrayMethod
 * @package Arrays
 * @description 数组方法
 */
public class ArrayMethod {

    //打印数组元素
    public  void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }
    //反转数组
    public  int[] turnArray(int[] arrays){
        int[] x = new int[arrays.length];
        int j = arrays.length- 1;
        for (int i = 0; i < arrays.length; i++) {
            while(j>0){
                x[j]= arrays[i];
                j--;
                break;
            }
        }
        return x;
    }
}

