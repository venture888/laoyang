package Study;

public class People {
    /**
     * API文档注释
     */
    private String name;//属性——>实例变量、成员变量
    int age;
    People(){
        //无参构造函数
        name=null;
        age=0;
    }
    People(String n,int a){
        name=n;
        age=a;
    }

    public String getName() {
        return name;
    }


    //行为，成员方法
    void eat(){
        System.out.println(name+"吃饭");
    }
}
