package base;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("输出的信息");
        int i = 12;
        double ie = 12;
        System.out.println(i+ie);
    }
}
/*
 class 关键字：用于java中声明一个类
 public 关键字；一个表示可见性的访问修饰符
 static 关键字：用来声明任何一个方法，被修饰后的方法称为静态方法。静态方法不需要为其创建对象就能调用
 void 关键字：表示该方法不返回任何值
 main 关键字：表示该方法为主方法，也就是程序运行的入口。main()方法由java虚拟机执行，配合上static
            可以不用创建对象就可以调用，可以节约不少内存空间。
 String [] args: 这是main()方法的参数，类型为String 数组；参数名为args
 System.out.println()：一个java语句，一个一般情况下是将传递的参数打印到控制台。
                      System是 java.lang包中的一个final类，该类提供的设施包括标准
                      输入、标准输出和错误输出流等等。
                      out是 System类的静态成员字段，类型为PrintStream
                      它与主机的标准输出控制台进行映射。
                      println 是 PrintStream 类 的一个方法，通过调用print方法并添加一个换行符实现
 */
