package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className Application
 * @package OOP
 * @description Main方法
 */
//一个项目应该只有一个类
public class Application {
    public static void main(String[] args) {
        Student zaizai = new Student();
        Student xiaoxiao = new Student();
        zaizai.name = "崽崽";
        zaizai.age = 1;
        zaizai.ID = 001;
        xiaoxiao.name = "晓晓";
        xiaoxiao.age = 2;
        xiaoxiao.ID = 002;
        StudentEncapsulation student =new StudentEncapsulation();
        student.setName("崽崽");

    }
}
