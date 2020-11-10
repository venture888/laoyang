package TestCode.src1;
//class InstanceClass{
//        public InstanceClass(){
//            System.out.println("实例变量");
//        }
//    }
//
//    class StaticClass{
//        public StaticClass(){
//            System.out.println("静态变量");  //静态变量类加载过程时初始化
//        }
//    }
//class Animal {
//    //private String name;   //实例变量(没有办法打印，构造一个实例类)
//    private InstanceClass name=new InstanceClass();  //定义一个类初始化实例变量
//    private static StaticClass staticA=new StaticClass();   //静态变量
//
//    public Animal() {
//        System.out.println("构造函数");
//    }
//    static{
//        System.out.println("静态块");  //专门用来初始化 静态变量
//    }
//    {
//        System.out.println("实例块");  //实例块   初始化实例变量
//    }
//}




public class Test20_10_20 {
    //单例模式
    private Test20_10_20(){//构造函数私有，否则外界想new对象就可以new。不能满足只实例化一个对象的要求

    }
    public static Test20_10_20 getInstance(){  //在这个函数里面控制只生成一个对象
        return new Test20_10_20();
    }


    public static void main(String[] args) {

    }


}



























//    public  double Total(int i){
//        int basic=20;
//        double total=0;
//        if(i-100>0){
//            total=basic+0.15*(i-100);
//        }else{
//            total=basic;
//        }
//        return total;
//    }
//
//    public static void main(String[] args){
//        //大家都对各种手机套餐资费有所了解，现在假设有一种资费情况为：每月基本套餐使用费20元，
//        //其中包括主叫100分钟通话时间，超过100分钟后，主叫每分钟0.15元。给定一个主叫通话时间210分钟，
//        //试计算出所需要的电话费用?
//        System.out.println("请输入你的主通话时间：");
//        Scanner phone=new Scanner(System.in);
//        int i=phone.nextInt();
//        Test20_10_20 a=new Test20_10_20();
//        double total=a.Total(i);
//        System.out.println("请输入总时长："+total);
//    }
//}

