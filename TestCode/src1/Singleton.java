package TestCode.src1;
// TODO: 2020-10-27  线程安全的单例模式
//class People1{
//}
//单例模式--懒汉模式（慢加载单例模式）  这里的慢指的是：调用顺序（类的初始化顺序：静态变量，静态块，实例变量，实例块，构造方法）
//这个调用在静态方法里调用，类已经加载完成了

//public class Singleton {
//    private static People1 people;  //静态变量，存储在方法区上  一个类只有一个people引用变量
//    //private int a;  存储在堆上，一个对象，一份实例变量
//    private Singleton(){
//    }
//    public static  People1 getInstance(){
//        if(people==null){
//            people=new People1();//加判断条件，实现只new一次
//        }
//        return people;
//    }
//}



////快加载单例，用静态变量new对象（饿汉单例）
//public class Singleton {
//    private static People1 people=new People1();
//    private Singleton(){
//    }
//    public static  People1 getInstance(){
//        return people;
//    }
//}

//静态内部类实现的单例模式、枚举单例模式
