package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className ArrayDemo
 * @package Arrays
 * @description array练习
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //给所有的元素赋值
        int x = 1;
        for (int i = 0; i < array.length; i++,x++) {
            array[i] = x;
            System.out.println(array[i]);
        }
        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);

        //找出数组的最大值
        int max= 0;
        for (int i = 0; i < array.length ; i++) {
            max = array[0];
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
        //找出数组最小值
        int min= 0;
        for (int i = 0; i < array.length ; i++) {
            min = array[0];
            if(array[i]<max){
                min = array[i];
            }
        }
        System.out.println(min);
        //增强for循环
        int[] ares = {1,2,4,1,2,6,4,3,0};
        for(int i:ares){
            System.out.println(ares);
        }

    }
}
