package Exception;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className MyException
 * @package Exception
 * @description 自定义异常
 */
public class MyException extends Exception{

    private int detail;
    public MyException(int a){
        this.detail =a;
    }
    //toString:异常信息打印

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
