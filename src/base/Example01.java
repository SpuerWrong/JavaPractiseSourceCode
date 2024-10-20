package base;

public class Example01 {
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu2 =stu1;
        stu1.name = "李涵";
        stu2.name = "雅琪";
        stu1.name = "李涵2";
        stu1.age = 20;
        stu2.age = 23;
        stu1.read();
        stu2.read();

    }
}