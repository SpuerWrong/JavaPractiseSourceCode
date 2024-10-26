package Exception;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Demo
 * @package Exception
 * @description 实例
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();

        int a = 1;
        int b = 0;
        try{//try可以去监控区域
            System.out.println(a/b);

        }catch(ArithmeticException e){//捕获异常 catch的参数：想要捕获的异常类型
            System.out.println("程序异常，变量b不能为0");
        }finally{//无论是否会由异常finally都会被执行
            System.out.println("finally");
        }//try和catch是连在一起用的关键词。可以不用finally
        try{//假设要捕获多个异常，要根据异常类型的范围从小到大
            demo.aVoid();
        } catch (Exception e) {
            System.out.println("程序异常");
        } catch(Throwable e){//catch可以根据捕获异常类型的不同层层递进，

        }



    }

    public void aVoid(){
        b();
    }
    public void b(){
        aVoid();
    }
}
