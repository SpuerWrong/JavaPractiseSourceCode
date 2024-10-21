package Arrays;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className Arrays
 * @package Arrays
 * @description main
 */
public class Arrays {
    public static void main(String[] args) {
        ArrayMethod array = new ArrayMethod();
        MaoPao maopao = new MaoPao();
        int[] test = {1,45,532,23,65,234,23,32144,1324,652,134,1324,121,111,5567,100,0};
        maopao.sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+"  ");
        }

        int[] numbs = {1,2,3,4,5,6,7,8};
        array.printArray(numbs);
        numbs = array.turnArray(numbs);
        array.printArray(numbs);
    }
}
