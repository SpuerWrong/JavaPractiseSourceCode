package base;

public class Student11 {
    private String name;
    private int age;
    private static String school = "A 大学";
    public Student11(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄："+age+",学校："+school);
    }
    public static String getSchool(){
        return school;
    }
    public static void setSchool(String s){
        school = s;
    }

}
