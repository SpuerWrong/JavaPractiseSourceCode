package base;

//定义Action接口继承Animal_interface接口和Color接口
abstract interface Action extends Animal_interface,Color{
    public abstract void eat();
}
