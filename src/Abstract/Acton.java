package Abstract;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Acton
 * @package Abstract
 * @description 抽象类
 */
//抽象类
    //抽象类本质上还是一个类，类的继承extends，只能单继承
public abstract class Acton {
    //抽象类里面的抽象方法
    //继承抽象类的子类，必须重写抽象方法
    public abstract void doSomething();
}
