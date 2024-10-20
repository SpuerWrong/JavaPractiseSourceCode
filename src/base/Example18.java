package base;

public class Example18 {
    public static void main(String[] args){
        Animal_instanceof a1 = new Dog_instanceof();
        System.out.println("Animal a1 = new Dog():"+(a1 instanceof Animal_instanceof));
        System.out.println("Animal a1 = new Dog():"+(a1 instanceof Dog_instanceof));
        Animal_instanceof a2 = new Animal_instanceof();
        System.out.println("Animal a2 = new Animal():"+(a2 instanceof Animal_instanceof));
        System.out.println("Animal a2 = new Animal():"+(a2 instanceof Dog_instanceof));

    }
}
