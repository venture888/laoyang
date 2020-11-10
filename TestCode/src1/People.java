package TestCode.src1;
//在包下创建一个People类

/**
 * this 关键字使用：
 * this（） 调用必须位于当前构造函数有效代码第一行（重点）
 * 1、如果局部变量和成员变量产生命名冲突，需要显示指明当前对象   this.name=name;
 * 2、函数重载中，（构造函数重载）
 *    1）构造函数之间不能使用this进行相互调用
 *    2）this（）调用构造函数时，不能在普通函数（成员函数）中调用
 *    3）当前构造函数不能通过this调用多个构造函数
 */
public class People {
    //1、属性：成员变量或实例变量   (底下所有的函数共用一份成员变量)
    //默认this  指向当前对象
    private String name;
    int age;  //java中不允许使用未经初始化的局部变量
    String sex;
    public static int count;

    //2、构造函数、方法——>专门初始化成员变量，给类型默认值
    //如果当前当前类里面没有提供构造函数，JVM默认生成无参构造函数，（所以name有初始化值）
    // (无参构造方法没有返回值，他的函数名与类名一样，赋类型默认值)
//     People(){
//            name=null;
//            age=0;
//            sex=null;
//        }

    //有参构造函数    (如果自己实现了构造函数，JVM不会在生成无参构造)

    People(String name,int age,String sex) {   //构造函数中参数与成员属性名在命名上发生冲突，
        this.name = name;  //就近原则，所以需要将局部变量的name赋值给成员变量
        this.age = age;//将局部变量的age赋值给属性age
        this.sex = sex;
        //this();不允许使用this（）进行相互调用，因为会陷入死循环
    }
    //构造方法重载
    People(){
        //对于构造函数如何调用？
        this("zs",10,"nan");
    }

    //将私有方法可以被外界所访问
        public String getName(){
            return this.name;
        }
        public static void funStatic(){   //没有this引用
        //name="zs";  （不能使用）   //凡是需要this的在静态方法里都不能访问，因为静态方法针对的是类而不是对象
        count=10;  //静态函数只能访问静态变量     （因为静态函数里面没有this引用）与对象无关，只于类有关
        }

    //3、行为：成员方法或实例方法
    public void eat(){     //eat() ——> eat(People this)   因此我们在调用它时，实质上涉及传参过程   p1.eat（）——> eat(p1);
        funStatic();//实例方法中可以调用静态方法，因为静态方法不需要this
        System.out.println(name+"吃饭");     //实质上是：System.out.println(this.name+"吃饭") 当前对象在吃饭
        //函数调用（调用下面的eat方法）
        this.eat("zs");   //调用当前对象的eat方法
    }
    public void eat(String name){
        System.out.println("指定"+name+"在吃饭");
        //函数重载（函数名一样，参数列表不同）
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
