package TestCode.src1;

import java.util.Scanner;

public class Test10_06 {
    //2、n是由键盘输入的，例如：n=5，S=a+aa+aaa+aaaa+aaaaa；求和
    public static int getResultSum(int n,int a){
        int result=0;
        int temp=0,bit=0;//假设a=1
        for(int i=0;i<n;i++){
            temp+=a*Math.pow(10,bit++);//temp=temp+Math.pow(10,bit++);
            result+=temp;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        System.out.println(getResultSum(n,a));
    }

}

    //1、判断一个数是否是水仙花数
    //功能：确保这个数是一个三位数
//    public static int getBit(int num) {
//        int count = 0;
//        while (num != 0) {
//            num /= 10;
//            count++;
//        }
//        return count;
//    }
//
//    public static boolean isFlower(int num) {
//        //参数安全性检测
//        int bit = getBit(num);//获取当前数值是否是三位数
//        if (bit != 3) {//是否是三位数
//            return false;
//        }
//        //num:153=1+5+3
//        int src = num;//保存原来的num（因为num通过上面的运算会变为0）
//        int result = 0;
//        while (bit > 0) {
//            result += Math.pow(num % 10, 3);//给num的这个值三次方
//            num /= 10;
//            bit--;
//        }
//        if (src == result) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
////            Scanner scanner = new Scanner(System.in);
////            int num = scanner.nextInt();
//        for (int num = 100; num < 1000; num++) {
//            boolean result = isFlower(num);
//            if (result) {
//                System.out.println(num + "是水仙花");
////            } else{
////                System.out.println(num+"不是水仙花");
////        }
//            }
//        }
//    }
//}