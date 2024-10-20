package base;

public class Example05 {
    public static void main(String[] args){
        Student05 stu1 = new Student05("李涵");
        Student05 stu2 = new Student05("秋",18);
        Student05 stu3 = new Student05();
        stu1.read();
        stu2.read();
        stu3.read();

    }
}
