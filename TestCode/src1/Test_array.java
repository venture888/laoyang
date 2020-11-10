//package TestCode;
////二分查找
//
//import java.util.Scanner;
//
//public class Test_array {
////    //自己写的代码
////
////    public static int binarySearch(int[] arr, int value) {  //注意这里函数有返回值，返回的是找到值的下标
////        int left = 0;
////        int right = arr.length - 1;
////        int mid = (left + right) / 2;
////        while (left < right) {
////            if (arr[mid] != value) {
////                if (arr[mid] > value) {
////                    right = mid - 1;
////                } else {
////                    left = mid + 1;
////                }
////            } else {
////                return mid;
////            }
////            return -1;
////        }
////
////            public static void main (String[]args){
////                int[] arr = {1, 3, 5, 7, 9, 10};
////                int value = 10;
////                binarySearch(arr, value);
////            }
////        }
////    }
////}
//
//
//    //规范代码
//    //注意：参数安全性检测.（要对该代码进行优化，主要是对midIndex = (left + right) / 2进行修改）
////    public static int binarySearch0(int[] arr, int beginIndex, int endIndex, int value) {
////        if (arr == null || beginIndex >= arr.length || endIndex <= 0) {   //注意：参数安全性检测
////            return -1;
////        }
////        int left = beginIndex, right = endIndex, midIndex;
////        while (left <= right) {
////            midIndex = (left + right) / 2;//1+1  内存上采用二进制进行运算，实质上是进行位运算（10/2-》5  相当于右移一个位）
////            //(优化)midIndex=(left+right)>>>1;
////            //相加怕越界：（a+b）/2 -> (b-a)/2+a : midindex=(（right-left)>>>1)+left;    加减比位运算优先级要高一些
////            if (arr[midIndex] < value) {
////                left = midIndex + 1;
////            } else if (arr[midIndex] > value) {
////                right = midIndex - 1;
////            } else {
////                return midIndex;
////            }
////        }
////        return -1;
////    }
////
////    public static int binarySearch(int[] arr,int value){
////        return binarySearch0(arr,0,arr.length-1,value);
////}
////
////    public static void main(String[] args) {
////        int[] arr={2,4,5,7,8};
////        int value=7;
////        int a=binarySearch(arr,value);
////        System.out.println(a);
////    }
////}
//
//
//
//
//    //登录注册操作的实现
//    //因为注册和登录都需要查找，可以将他们公共部分这个查找功能提出来，作为一个函数，减少代码的重复性
//    public static int search(int[] member,int value){
//        //在数组中查找是否存在该id，存在登录成功，不存在失败
//        for(int i=0;i=size;i++){//如果这里第二个参数用member.length,万一开辟了1000个格子，但有效用户只有3个，这样做十分浪费时间
//            //size->数组，有效注册用户，login，register用到的都是同一个内存
//            if(member[i]==value){
//                return i;
//            }
//        }
//       return -1;
//    }
//
//    public static void login(int[] member){
//        System.out.println("请输入登录的账号");
//        Scanner scanner=new Scanner(System.in);
//        int id=scanner.nextInt();
//       int index=search(member,id);
//       if(index>=0) {
//           System.out.println("登录成功");
//       }else{
//           System.out.println("登录失败");
//       }
//    }
//
//    public static void register(int[] member){
//        System.out.println("请输入注册账号");
//        Scanner scanner=new Scanner(System.in);
//        int id=scanner.nextInt();
//        //1、在原数组中查找是否存在id，存在打印不注册。
//        int index=search(member,id);
//        if(index>=0){//存在
//            System.out.println("已注册，请登录");
//            return;
//        }
//        // 2、不存在，需要在数组中存元素   size    TODO:扩容情况？？
//        member[size++]=id;
//        System.out.println("注册成功");
//    }
//
//    public static void operate() {
//        System.out.println("请输入： 1 登录  2 注册  3 退出");
//        Scanner scanner = new Scanner(System.in);
//        int chioce = scanner.nextInt();
//
//        //登录注册在查找数据时，调用的是同一块堆内存
//        final int INITSIZE=10;
//        int[] member=new int[INITSIZE];
//
//        if (chioce == 3) {
//            return;
//        }
//        switch (chioce) {
//            //将登录，注册这两个功能都封装成函数，然后进行调用
//            case 1:
//                login(member);
//                break;
//            case 2:
//                register(member);
//                break;
//            default:
//                System.out.println("输入数字有误");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        operate();
//    }
//}
//
//
//
//
//
////        int[]arr=new int[10];//类型默认值（0）
//////        arr[0]=1;
////        boolean[]brr=new  boolean[3];
////        System.out.println(brr[0]);
//        //1、给定一个数组[1,2,3,4,5,1,2]   删除数组中的元素2，测试用例：[1,1,1,1,4,2,3]
//        //2、整型：求位数，逆序问题  123——》321
//
///*
// * 用冒泡法对10个整数进行排序
// * 3 2 1 4 8     一趟将最大值的序号由前面位置冒到最后的位置，第二趟i重新从0号下标开始
// * 前者>后者  i>i+1    需要交换
// * 趟数对应元素的个数，在每一趟过程中需要让i移动
// * 优化：万一数据本身有序，应该怎么办？
// */
