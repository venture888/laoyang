package Study;

import com.sun.xml.internal.bind.v2.TODO;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_20_11_07 {
    //TODO：插入排序
    public static void insertSort(int[]arr){
        if (arr==null||arr.length==0){
            return;
        }
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i+1];
            for(j=i;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=temp;
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }



    //TODO:选择排序——>与冒泡相反，将小数往上冒（i控制有序序列，j在当前i以后的序列中找最小值）
    public static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    //TODO:选择排序优化
//    public static void selectSort(int[]arr) {
//        if (arr == null || arr.length == 0) {
//            return;
//        }
//        int begin = 0;
//        int end = arr.length - 1;
//        int maxindex = arr[begin];
//        int minindex = arr[begin];
//        while (begin < end) {
//            for (int z = begin; z < end; z++) {
//                if (arr[z] > arr[maxindex]) {
//                    maxindex = z;
//                }
//                if (arr[z] < arr[minindex]) {
//                    minindex = z;
//                }
//            }
//            swap(arr, minindex, begin);
//            swap(arr, maxindex, end);
//            begin++;
//            end--;
//        }
//    }
//    public static void selectSort(int[]arr){
//        if(arr==null||arr.length==0){
//            return;
//        }
//        int mindex;
//        for (int i=0;i<arr.length;i++){
//            //找最小值(假设起始位置为最小值）
//            mindex=i;
//            for(int j=i;j<arr.length;j++){
//                if(arr[mindex]>arr[j]){
//                    mindex=j;
//                }
//            }
//            swap(arr,i,mindex);//最小元素和待排序相对的首位进行交换
//        }
//    }
    public static void main(String[] args) {
        int[]arr={4,3,1,8,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //TODO:二分查找（注意要为有序数组）
    // 时间复杂度O（log2^n），空间复杂度O（1）没有开辟新的空间，与问题规模无关
//    public static int binarySearch(int arr[],int value){
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            int mid=((right-left)>>>1)+left;  //优化：1）越界问题  2)位运算优化,注意优先级
//            if(arr[mid]==value){
//                return mid;
//            }else if(arr[mid]<value){
//                left=mid+1;
//            }else{
//                right=mid-1;
//            }
//        }
//        return -1;//没有找到的情况
//    }
//    public static void main(String[] args) {
//        int[]arr={3,4,6,8,9};
//        int a=binarySearch(arr,9);
//        System.out.println("该值所对应的下标为："+a+" 值的大小是："+arr[a]);
//    }



    //TODO:冒泡排序
//    public static void swap(int[] arr,int index1,int index2){
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
//    public static void bubbleSort(int[] arr){
//        //参数安全性检验
//        if(arr==null || arr.length==1){
//            return;
//        }
//        boolean flag=false;
//        for(int j=0;j<arr.length;j++) {//j控制趟数
//            flag=false;//每一趟都是一个新的flag
//
//            for (int i= 0; i< arr.length-1-j; i++) {  //要-1，防止i+1下标越界（每一趟操作思路）
//                if (arr[i] > arr[i + 1]) {
//                    flag=true;
//                    swap(arr, i, i + 1);
//                }
//            }
//            if(flag){
//                continue;
//            }else{
//                return;  //break;跳出当前大循（第一层循环）
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr={2,3,1,6,4,7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
}
