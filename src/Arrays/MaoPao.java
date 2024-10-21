package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className MaoPao
 * @package Arrays
 * @description 冒泡排序法
 */
public class MaoPao {
    public int[] sort(int[] arrays){
        int temp =0;
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = 0; j < arrays.length-1; j++) {
                if(arrays[j+1]>arrays[j]){
                    temp =arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1]= temp;
                }
            }
        }
        return arrays;
    }
}
