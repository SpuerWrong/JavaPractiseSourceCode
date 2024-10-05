public class School10 {
    String name;
    int age;
    static String school = "A 大学";
    public School10(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄"+this.age+",学校"+school);
    }
}
