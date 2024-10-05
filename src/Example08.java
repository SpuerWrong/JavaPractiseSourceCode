public class Example08 {
    public static void main(String[] args){
        Student08 stu = new Student08("李涵",22);
        Student08 stu1 = new Student08("李涵");
        System.out.println(stu.read());
        System.out.println(stu1.read());
    }
}
