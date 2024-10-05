public class Test {
    public int aa;
    protected boolean bb;
    void cc(){
        System.out.println("包访问权限");

    }
    private class InnerClass{
        void display(){
            System.out.println("这是内部类的方法");
        }
    }
    void createInnerClass(){
        InnerClass inner = new InnerClass();
        inner.display();
    }
    public static void main(String[] args){
        Test test =new Test();
        test.createInnerClass();
        int a=1;


    }
}
