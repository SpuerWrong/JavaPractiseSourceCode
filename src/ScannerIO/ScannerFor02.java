package ScannerIO;

/**
 * @author 王丽杰
 * @date 2024/10/20
 * @className ScannerFor02
 * @package ScannerIO
 * @description 用while或for循环输出1-1000之间能被5整除的数，并以每行输出3个的形式输出
 */
public class ScannerFor02 {
    public static void main(String[] args) {
        int con=0;
        for(int i = 1 ; i<=1000 ; i++){
            if(i%5==0){
                    System.out.print(i+"  ");
                    con++;
                }
            if(con==3){
                System.out.println();
                con = 0;
            }


        }
    }
}
