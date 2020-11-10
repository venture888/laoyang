package TestCode.src1;
import java.util.Arrays;

//public class Test10_13_O_quickly {
//    public  static void swap(int[] arr,int index1,int index2){
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
//    /**
//     * 冒泡排序  ToDo:如果数据偏向有序，怎么优化？  设置标记元素
//     * @param arr
//     */
//    public static void bubbleSort(int[] arr){
//        if(arr==null){
//            return;
//        }
//
//
//        for(int i=0;i<arr.length;i++){   //i控制趟数
//            boolean flag=false;//用来标记，标记当前趟是否进行交换，如果进行过，需要将flag改为true
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){  //前者大于后者，两两交换    出现问题：if条件为j<arr.length-i，此时arr[j+1]为越界，所以修改条件为j<arr.length-i-1
//                    swap(arr,j,j+1);
//                    flag=true;
//                }
//            }
//            if(flag==false){
//                break; //跳出本层循环
//            }
//        }
//
//}
//public static void main(String[] args){
//    //1.无序数组
////    int[] arr={1,4,2,4,6,6,4,0};
//    //2.若为有序数组如何优化代码
//    int[] arr={1,2,3,4,5,6};
//    bubbleSort(arr);//排序是对原始数据进行操作，不会涉及到新开辟内存的问题
//    System.out.println(Arrays.toString(arr));
//}
//
//
//}





//删除指定元素
public class Test10_13_O_quickly {
    /**
     * API帮助文档
     * 删除数组中的元素
     *
     * @param arr   数组
     * @param value 待删元素
     */

    public static int[] deleteValue(int[] arr, int value) {
        //参数安全性检测
        if (arr == null || arr.length == 0) {
            return null;
        }
        int count = 0;
        for (int i = 0; i < arr.length-count;) {   //修改，遍历时不要把无效的格子也遍历上，所以改为j<arr.length-count  （找删除的数字，在我们不断缩小的区间中去找）
            if (arr[i] == value) {//找到后，涉及到数据的移动和缩容
                for (int j = i + 1; j <arr.length; j++) {
                    arr[j - 1] = arr[j];//数据覆盖
                }
                count++;
            }else{
                i++;  //因为数据移动后当前位置还可能为待删元素，所以需要分情况讨论   （if：当前元素不是需要删除的元素，此时才i++）
            }
        }
            //缩  Arrays.copyOf();
            return Arrays.copyOf(arr, arr.length - count);
        }

        public static void main (String[] args){
//            //1.测试用例——无重复元素进行删除操作
//            int[] arr = {1,3,4,10,2};
//            arr=deleteValue(arr,2);//{1，3，4，10，2，2}出现问题无法用后面的2将前面的2覆盖掉（注意：[5]号下标的2是无效的2）
//            System.out.println(Arrays.toString(arr));

            //2、测试用例（特殊情况）
          int[] arr={1,2,2,3};
          arr=deleteValue(arr,2);    //不用返回值就可以打印，是因为deleteValue函数操作的就是主函数的arr的值
          System.out.println(Arrays.toString(arr));

        }
    }


