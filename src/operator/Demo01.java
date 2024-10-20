package operator;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = ++a;//先执行a=a+1的指令，再将结果赋值给b
    /*等效于：
    a = a + 1;
    b =a;
     */
        System.out.println(a);
        System.out.println(b);
        int c = a++;//先将a原来的值赋值给c，再执行a=a+1;
    /*等效于：
    c = a;
    a = a + 1;
     */
        System.out.println(a);
        System.out.println(b);

        double pow = Math.pow(2,3);
        System.out.println(pow);
    }


}
