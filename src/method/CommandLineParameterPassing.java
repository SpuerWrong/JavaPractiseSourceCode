package method;

/**
 * @author 王丽杰
 * @date 2024/10/21
 * @className CommandLineParameterPassing
 * @package method
 * @description 命令行参数传递（命令行传参）
 */
public class CommandLineParameterPassing {
    public static void main(String[] args) {
        //args.Length 数组长度
        for (int i = 0; i< args.length;i++){
            System.out.println("args["+i+"]:"+args[i]);
        }
    }
}
