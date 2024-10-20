package base;

//定义接口Animal
interface Animal_interface {
    int ID =1;
    String NAME ="二哈";
    void shout();
    public void info();
    static int getID(){
        return Animal_interface.ID;
    }
}
