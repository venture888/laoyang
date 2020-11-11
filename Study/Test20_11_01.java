package Study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test20_11_01 {
//    public static void change(int[]arr,int index,int value){
//        arr[index]=value;
//    }

    public static int getCount(int[] arr) {
        //1.统计有效数字个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }

    //2.考虑是否需要扩容
    public static int[] grow(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length + 1);  //TODO: 这里将arr的地址修改了，所以要给该函数一个返回值
        return arr;
    }


    public static int[] addTail(int[] arr, int value) {//尾部添加操作
        int count = getCount(arr);

        //考虑是否需要扩容
        if (arr.length == count) {  //数组满了
            arr = grow(arr);
        }
        arr[count] = value;
        return arr;
    }

    public static int[] addHead(int[] arr, int value) {
        int count = getCount(arr);
        int srclength = arr.length;
        if (count == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + 1);
        }
        int index;
        for (index = srclength - 1; index >= 0; index--) {
            arr[index + 1] = arr[index];//依次向后移一位，将头部空出来
        }
        //此时index=-1
        arr[index + 1] = value;
        return arr;
    }
//    public static void main(String[] args) {
//        int[]arr=new int[]{1,2,3,4};
////        int[]brr=addTail(arr,88);
//        int[]brr=addHead(arr,99);
//        System.out.println(Arrays.toString(brr));  //tostring用于拷贝
//    }
//}

//作业：给字符串“sxanhduhqwuann",统计出'a','s'出现的次数
    public static int getcount(String str,char c){
        int count=0;
        char[]arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="sxxxssssoiaaaap";
        int countS=getcount(str,'a');
        int countX=getcount(str,'x');
        System.out.println(countS);

    }
}