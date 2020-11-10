package TestCode.src1;

import java.util.Arrays;

// TODO: String类

/**
 * String类掌握的方法：toCharArray（）转数组
 * 1、equal方法比较
 * 2、char c=charAt（int index）
 * 3、字符串长度=str.length()
 * 4、分割函数：split
 * 5、subString（）找子串位置，返回起始下标。   compareTo（）比较函数。   toUpperCase（）转大写
 * 6、String.valueOf（10）；将整型10转为字符串类型
 *
 *
 *
 * 1、String类构成    (底层以字符数组存储)——>“hello”：每一个字母存储在一个小格子中
 * final char[] ch;
 *
 *2、字符串拼接 ——> + 的底层实现  （“hello”+“world”与str+“world”的区别）
 *    1)常量+常量   “hello”+“world”
 *      编译器优化——>helloworld（将其合并为一个）
 *    2）变量+常量  String str=“1”；str+“2”；——>"12"
 * 3、StringBuilder和StringBuffer的区别
 */
public class Test20_10_27 {
    public static void main(String[] args) {
        String str="nihao";
        String result=str+"tulun";
        System.out.println(result);





//        String str="hello aa";
//        String[] arr=str.split(" ");//字符串分割，以空格划分存入数组
//        System.out.println(arr[0]);
//
//        char c=str.charAt(2);//charAt获取下标所对应的字符
//        System.out.println(c);
//        System.out.println("你好".equals("你好"));    //比较字符串是用equal比较，不能用==
    }
}







//    public static void main(String[] args) {
//        People1 p1=Singleton.getInstance();
//        People1 p2=Singleton.getInstance();
//        System.out.println(p1==p2);
//    }
//}

