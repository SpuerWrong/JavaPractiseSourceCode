package method;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className VariableParameterPassing
 * @package method
 * @description 可变传参
 */
public class VariableParameterPassing {
    public static void main(String[] args) {
        VariableParameterPassing v = new VariableParameterPassing();
        v.method(1);
    }

    public void method(){}
    public void method(int i){}
    public void method(int i,int j){}
    public void method(int i, int j,int f  ){}
    public void method(int...i){}

}
