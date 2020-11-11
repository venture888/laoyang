package Study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyarrayList {
    private int[] element;
    private final int INITSIZE = 10;
    private int size; //用来记录当前有效个数

    public MyarrayList() {
        element = new int[INITSIZE];
    }


    public void addHead(int value) {
        ensureCapacity();
        for (int i = size; i > 0; i--) {//
            element[i] = element[i - 1];
        }
        element[0] = value;
        size++;
    }


    public void ensureCapacity() {
        if (element.length == size) {
            int newLength = element.length + (element.length >> 1);  //扩容1.51倍
            element = Arrays.copyOf(element, element.length + 1);
        }
    }

    public void addTail(int[] arr, int value) {
        ensureCapacity();
        element[size++] = value;
    }

    public void removeHead() {
        if (size == 0) {   //数组没有数据
            return;
        }
        for (int j = 1; j < size; j++) {  //注意边界
            element[j - 1] = element[j];
        }
        size--;
    }

    public void removeTail() {
        if (size == 0) {
            return;
        }
        size--;
    }

    public void removeValue(int value) {
        if(size==0){
            return;
        }
        for(int i=0;i<size;){
            if(element[i]==value){
                //数据移动
                for(int j=i+1;j<size;j++){
                    element[j-1]=element[j];
                }
                size--;
            }else{
                i++;
            }
        }
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (element[i] == value) {
                return true;
            }
        }
        return false;
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(element[i]);
            System.out.println();
        }
    }

}

