package Study;

import java.util.Arrays;
import java.util.Scanner;

/**文档注释
     * 一维数组
     * 面试真题
     * 1. 奇偶排序问题解析
     * 3 2 1 6 6 4 5 0
     *
     * 2. 二分查找算法   时间复杂度？
     * 前提：数组有序： 1 3 5 7 9 10     value: 9
     *
     * 3. 字符替换问题： 例子：i am a student 一个空格被替换为2个#
     *
     * 4. 基础排序算法问题以及算法效率解析
     * 冒泡，选择 插入
     *
     *
     * 二维数组:
     * 1  2  3  4
     * 5  6  7  8
     * 9 10 11 12
     * 13 14 15 16
     *
     * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     * 算法效率
     */



public class Test {
    //奇数在前，偶数在后
    //方法二：不用额外开辟空间
    public static void change(int[]arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){  //停止条件i==j
            //从前向后查找，直到找到偶数位置停止
            while (i<j && arr[i]%2!=0){//{2,1,3}——>i=3:{3,1,2}此时arr[j]=2%2=0,j--,j减完以后j<i,在跳出循环前会将2与1交换，所以结果不对。需要加上约束条件：i<j
                i++;
            }
            //跳出循环，此时i位置为偶数

            //从后向前查找，直到找到奇数位置停止
            while(i<j && arr[j]%2==0){
                j--;
            }
            //跳出循环，此时j标记奇数位置
            //swap(arr,i,j);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }

    }



    //方法一：额外开辟空间
//    public static int[] change(int[]arr){
//        int[]brr=new int[arr.length];
//        int i=0;//i用来控制员数组下标
//        int j=0;//j用来控制奇数在新数组存放的下标
//        int z=brr.length-1;//z用来控制偶数在新数组存放的下标
//        while(i<arr.length){
//            if(arr[i]%2==0){
//                brr[z--]=arr[i];
//            }else {
//                brr[j++]=arr[i];
//            }
//            i++;
//        }
//        return brr;
//    }
    public static void main(String[] args) {
        int[]arr={1,1,1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//    public static void insertSort(int[] arr){
//        if(arr == null || arr.length == 1){
//            return;
//        }
//        int j = 0;
//        for(int i = 0;i<arr.length-1;i++){
//            int temp = arr[i+1];
//            //找合适位置插入temp
//            for(j = i;j >= 0;j--){
//                if(arr[j] > temp){
//                    arr[j+1] = arr[j];
//                }else{
////                    arr[j+1] = temp;
//                    break;
//                }
//            }
//            arr[j+1] = temp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]arr={2,3,1,8,0};
//        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//}


//插入排序

//    public static void InsertSort(int []arr){
//        int temp;
//        int i=0;
//        temp=arr[i];
//        for(int j=i+1;j<arr.length-1;j++){
//            if(temp>arr[j]){
//                arr[j-1]=arr[j];
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        int[]arr={2,3,1,8,0};
//        InsertSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}



//选择排序
//public class Test {
//    public static void  swap(int[] arr,int index1,int index2){
//        if(arr==null||index1<0||index2<0){
//            return;
//        }
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//
//    }
//        int begin=0,end=arr.length-1;
//        while(begin<end){
//            int minindex=arr[begin],maxindex=arr[begin];
//            for(int z=begin;z<=end;z++){
//                if(arr[minindex]>arr[z]){
//                    minindex=z;
//                }
//                if(arr[maxindex]<arr[z]){
//                    maxindex=z;
//                }
//            }
//            swap(arr,minindex,begin);
//            swap(arr,maxindex,end);
//            begin++;
//            end--;
//
//        }
//
//
//    }
//
//
//
//
//    public static void main(String[] args) {
//        int[]arr={4,3,1,9,8,4,0,2};
//        selectSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}



//冒泡排序
//    public static void  swap(int[] arr,int index1,int index2){
//        if(arr==null||index1<0||index2<0){
//            return;
//        }
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//
//    }
//    public static void bubbleSort(int[] arr) {
//        if (arr == null || arr.length == 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i< arr.length - 1; i++) {  //i控制趟数
//            flag=false;
//            for (int j = 0; j< arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j+ 1]) {
//                    swap(arr,j,j+1);
//                     flag=true;
//
//                }
//            }
//            if(flag==false){
//                break;
//            }
//        }
//        }
//
//        public static void main (String[]args){
//            int[] arr = {4, 2, 3, 1, 0, 9, 5};
//            bubbleSort(arr);
//            System.out.println(Arrays.toString(arr));
//        }
//    }






//3. 字符替换问题： 例子：i am a student 一个空格被替换为2个#
//public class Test {
//    public static void count(String str){
//        char[] ch=str.toCharArray();
//        for(int i=0;i<ch.length-1;i++) {
//            if (ch[i] == ' ') {
//                ch[i] = '#';
//                for (int j = ch.length - 1; j < i; j--) {
//                    ch[j + 1] = ch[j];
//                }
//                ch[i + 1] = '#';
//                i++;
//            }
//        }
//    }
//    public static void main(String[]args){
//        String str="i am a student";
//        count(str);
//        }
//    }





    //2. 二分查找算法   时间复杂度？(前提：数组有序： 1 3 5 7 9 10     value: 9)

//    public class Test {
//        public static int binarySearch(int[] arr,int value){
//            int left = 0,right = arr.length-1;
//
//            while(left<=right) {
//                int midIndex = ((left+right)>>1)+left;  //优先级
//                if (arr[midIndex] == value) {
//                    return midIndex;
//                } else if (arr[midIndex] < value) {
//                    left = midIndex + 1;
//                } else {
//                    right = midIndex - 1;
//                }
//            }
//                return -1;
//        }
//
//        public static void main(String[] args) {
//            int[] arr = {1, 3, 5, 7, 9, 10};
//            int a = binarySearch(arr, 7);
//            System.out.println(a);
//
//
//        }
//
//
//    }









//1. 奇偶排序问题解析 ——3 2 1 6 6 4 5 0
// public class Test {
//    public static void sort(int[] arr) {
//        if(arr == null){
//            return;
//        }
//        int i = 0;
//        int j = arr.length - 1;
//        int temp = arr[0];
//        while (i<j) {
//            while (i<j&&arr[j] % 2 == 0) {  // 找到奇数为止
//                j--;
//            }
//            //j已经标记奇数位置
//            arr[i] = arr[j];
//            while (i<j&&arr[i] % 2 !=0) {  // 找到偶数位置停,  加上条件i<j为了防止该数组出现全是奇数,i一直++，出现下标越界的情况
//                i++;
//            }
//            arr[j] = arr[i];
//        }
//        arr[i] = temp;
//    }
//
//
//    public static void main(String[] args){
//        int []arr={1,3,5};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//
//}




