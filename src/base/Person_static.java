package base;

public class Person_static {
    public String name;
public Person_static(String name){
    this.name = name;
}

    public static void main(String[] args) {
    Person_static p1 =new Person_static("lihan");
        System.out.println(p1.name);
    }
}
