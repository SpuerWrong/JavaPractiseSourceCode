package operator;

public class Logical_operator {
    public static void main(String[] args) {
        // 与 &&
        // 或 ||
        // 非 ！
        boolean a = true;
        boolean b = false;
        System.out.println("a && b:"+(a&&b));  //逻辑与：两个变量都为真，结果才为真
        System.out.println("a || b:"+(a||b));  //逻辑或：两个变量有一个真，结果才为真
        System.out.println("!(a && b):"+!(a&&b)); //若是真则变假，若是假则变真
        //短路运算：若逻辑运算时前面就可以判断整个式子的真假，则不会运算后面的部分
    }
}
