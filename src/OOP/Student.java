package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className Student
 * @package OOP
 * @description 学生类
 */
public class Student {
    //属性
    String name;
    int ID;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int ID) {
        this.ID = ID;
    }

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}
