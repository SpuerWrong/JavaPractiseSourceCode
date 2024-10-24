package OOP;

/**
 * @author 王丽杰
 * @date 2024/10/24
 * @className Demo1
 * @package OOP
 * @description 引用传递
 */
public class Demo1 {
    public static void demo() {
        Person person = new Person();
        System.out.println(person.name);
        Demo1.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        person.name = "崽崽";
    }
    //定义了一个Person类，有一个属性：name
    static class Person{
        String name;
    }

    public static void main(String[] args) {

        demo();
    }
}
