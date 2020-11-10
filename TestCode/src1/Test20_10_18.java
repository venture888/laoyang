package TestCode.src1;

public class Test20_10_18 {
    public static void main(String[] args) {
//        People people=new People("zhangsan",10,"男");
//        //new:(1)在堆上开辟内存new int[10]——>在堆上开辟了40个字节的空间，new People()开辟了多少不知道？
//        //    (2) new People(),后面的小括号是用来进行函数调用的，调用无参构造函数
//        people.eat();//调用成员方法
//        System.out.println(people.name);
        Plane plane=new Plane("jduj",10,"ZH7777");
        System.out.println(plane.name);
        plane.fly();
    }
}
//main函数不要写在当前类里，当前类只是设计的产物，主程序是在测试类里面。









//import java.util.Arrays;
//
//public class Test20_10_18 {
//    /**
//     * 文档注释:  API帮助文档
//     * @param ch  字符数组
//     * @return -1参数不合法，如果返回 >0 的数字代表统计的个数
//     */
//    public static int getCount(char[] ch,char src){
//        //参数安全性检验
//        if(ch==null){
//            return -1;
//        }
//        int count=0;
//        for(int i=0;i<ch.length;i++){
//            if (ch[i] ==src) {       //将ch[i]==' '优化为ch[i]==char src   避免代码的鲁棒性，使用于多种情况 （不一定替换掉的是空格）
//                count++;//统计空格个数
//            }
//        }
//        return count;
//    }
//
//    public static String replace(String str,char src,char aim,int num) {   //char src 原来字符,char aim 目标字符,int num 替换为几个（此时是一对二的关系）
//        //参数安全性检测
//        if (str == null) {
//            return null;
//        }
//        //扩容操作
//        char[] ch = str.toCharArray();//将字符串string转化为字符数组
//        int i = ch.length - 1;//i 保存原始数组末端下标
//        int count = getCount(ch, src); //统计ch中要替换的字符个数
//        ch = Arrays.copyOf(ch, ch.length + (num - 1) * count); //扩容多大
//        int j = ch.length - 1;//j 保存新数组末端下标
//        while (i >= 0) {
//            if (ch[i] == src) { //if i所对应的值为空格
////  这只适用一对二，要具有通用性——>使用for循环
////                ch[j]=aim;  //将其值替换为一个#，用aim字符进行填充
////                j--;
////                ch[j]=aim;//在将j向前移一个格子，在填充一个#
////                j--;
//                for (int z = 0; z < num; z++) {
//                    ch[j] = aim;
//                    j--;
//                }
//                i--;    //替换完后i仍然在空格位置，应该将它向前移动一位
//            } else {
//                ch[j--] = ch[i--]; //先将i所对应值赋给j格子，在同时将两个都向前移动一个格子
//            }
//        }
//        return String.valueOf(ch);//将char数组转换为string
//    }
//
//    public static void main(String[] args) {
//        String result=replace("  i am ",' ','#',2);
//        System.out.println(result);
//
//
//    }
//
//}
