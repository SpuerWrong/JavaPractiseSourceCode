package base;

public class Example11 {
    public static void main(String[] args) {
        Student11 stu1 = new Student11("李涵", 15);
        Student11 stu2 = new Student11("秦", 20);
        Student11 stu3 = new Student11("秋", 25);
        System.out.println("---修改前---");
        stu1.info();
        stu2.info();
        stu3.info();
        System.out.println("---修改后---");
        Student11.setSchool("b collage");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
