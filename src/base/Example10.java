package base;

public class Example10 {
    public static void main(String[] args){
        School10 stu1 = new School10("李涵",23);
        School10 stu2 = new School10("雅琪",25);
        School10 stu3 = new School10("盈盈",20);
        stu1.info();
        stu2.info();
        stu3.info();
        //修饰stu1对象的school的值
        stu1.school = "B 大学";
        System.out.println("修改stu1学校对象的学校信息为B大学后");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
