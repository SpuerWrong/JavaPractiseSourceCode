public class Student02 {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("您输入的年龄有误");
        }else{
            this.age = age;
        }
    }
    public void read(){
        System.out.println("大家好，我是"+name+",年龄："+age);
    }
}
