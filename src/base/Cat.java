package base;

class Cat extends Animal03{
    private String color;
    public Cat(String name,double age,String color){
        super(name,age);
        this.setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String info(){
        return super.info()+",颜色："+this.getColor();
    }
}
