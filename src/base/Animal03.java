package base;

public class Animal03 {
    private String name;
    private double age;
    public Animal03(String name,double age){
        this.age =age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAge(){
        return  age;
    }
    public void setAge(double age){
        this.age = age;
    }
    public String info(){
        return "名称："+this.getName()+",年龄："+this.getAge();
    }

}
