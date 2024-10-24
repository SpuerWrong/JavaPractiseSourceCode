package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className SparseArray
 * @package Arrays
 * @description 稀松数组
 */
public class SparseArray {
    public static void main(String[] args) {
        // 原始二维数组，0 表示没有元素，1 表示有元素
        int[][] originalArray = new int[11][11];
        originalArray[1][2] = 1;
        originalArray[2][3] = 2;

        // 统计非零值个数
        int nonZeroCount = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (originalArray[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        // 创建稀疏数组
        int[][] sparseArray = new int[nonZeroCount + 1][3];
        sparseArray[0][0] = 11;  // 原数组的行数
        sparseArray[0][1] = 11;  // 原数组的列数
        sparseArray[0][2] = nonZeroCount;  // 非零元素的个数

        // 将非零值存入稀疏数组
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (originalArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = originalArray[i][j];
                }
            }
        }

        // 输出稀疏数组
        System.out.println("稀疏数组：");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
        }

        // 恢复二维数组
        int[][] restoredArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            restoredArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
    }
}
