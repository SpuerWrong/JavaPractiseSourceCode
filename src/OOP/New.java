package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className New
 * @package OOP
 * @description 测试 多态
 */
public class New extends Father{
    public void FatherMethod(){
        System.out.println("子类的方法重写");
    }

    @Override
    public void NewMethod() {
        super.NewMethod();
    }
}
