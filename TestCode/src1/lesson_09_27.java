package TestCode.src1;

public class lesson_09_27 {


}
//(练习)从键盘中输入a，b，c三个整型数字，比较得出最大值
//public static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//    int a=scanner.nextInt();
//    int b=scanner.nextInt();
//    int c=scanner.nextInt();
//    int max;
//    if(a<b){
//      max=b;
//    }else{
//        max=a;
//    }
//    if(max<c){
//        max=c;
//    }
//    System.out.println(max);
//    //优化：——使用三目运算符   int max=(a>b?a:b)>c?(a>b?a:b):c
//}
//}




//    2、实现登录页面提示
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int choice=scanner.nextInt();
//        switch(choice){
//            case 1:
//                System.out.println("登录");
//                break;//跳出switch语句块
//            case 2:
//                System.out.println("注册");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
//
//    }
//    }


//1、用if-else语句判断成绩
//public class lesson_09_27 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int score=scanner.nextInt();
//        if(score>=85&&score<=100){
//            System.out.println("A等级");
//        }else if(score>=75&&score<85){
//            System.out.println("B等级");
//        }else if(score>=60&&score<75){
//            System.out.println("C等级");
//        }else if(score>=0&&score<60) {  //可以直接else
//            System.out.println("D等级");
//        }
//    }
//}