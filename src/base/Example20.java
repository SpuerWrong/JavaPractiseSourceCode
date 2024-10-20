package base;

public class Example20 {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show_Inner();
        inner.show2();
    }
}
