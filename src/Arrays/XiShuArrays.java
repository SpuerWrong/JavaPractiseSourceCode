package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className XiShuArrays
 * @package Arrays
 * @description 稀疏数组
 */
public class XiShuArrays {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        array1[1][2] = 1;
        array1[2][3] = 2;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }

    }

}
