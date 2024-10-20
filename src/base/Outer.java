package base;

public class Outer {
    int m = 0;
    //外部类方法test_out
    void test_out(){
        System.out.println("外部类成员方法test out");
    }
    //下面定义成员内部类Inner
    class Inner{
        int n = 1;
        void show_Inner(){
            //在成员内部类的方法中访问外部类的成员变量m
            System.out.println("外部类成员变量m="+m);
            //在成员内部类的方法中访问外部类的成员方法test_out()
            test_out();
        }
        void show2(){
            System.out.println("内部类成员方法show2");
        }
    }
    //外部类方法test2()
    void test2(){
        Inner inner = new Inner();
        System.out.println("内部类成员变量n="+inner.n);
        inner.show2();
    }
}
