package Study;

public class Cat {
    //属性全部私有
    private String name;
    private String color;
    private int age;

    //发生命名冲突，加上this
    public Cat(String name,String color,int age) {     //将局部变量的name给当前对象的name
        this.name = name;
        this.color = color;
        this.age=age;
    }

    //调用私有属性
    public String getName(){
        return name;
    }


    public void catchMice(){   //catchMice(Cat this);  这里的this指的当前对象也就是cat1
        System.out.println(name+"抓老鼠");  //name+"抓老鼠"  这里的name是当前对象的name——>实质上是this.name
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
