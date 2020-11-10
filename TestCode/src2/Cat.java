package TestCode.src2;

public class Cat extends Animal {  //Cat继承自Animal，Animal类派生得到Cat类
    // Cat子类（派生类），Animal父类（基类）
    private boolean isBeard;
    public Cat(String name,int age,String color){
        super(name,age,color);
        this.isBeard=false;
    }


    public void  catchMice(){

    }
}
