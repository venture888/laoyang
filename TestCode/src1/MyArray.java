package TestCode.src1;

import java.util.Arrays;

/**
 * MyArray->把数组的增删改查操作，进行封装
 *
 * 先充当使用者：
 * MyArray my=new MyArray();
 * my.addHead(1);
 * my.addTail(2);
 * my.addtail(3);//实现头部添加一个1，尾部添加2,3
 * my。search(2); //查找2是否存在，结果为true
 * my.removeValue(2);//1 3
 * my.removeHead(); //3
 * my.removeTail();// Null
 * my.getElement();//获取数组然后进行打印
 *
 * Scanner scanner=new Scanner(System.in);
 * int n=scanner.nextInt();
 *
 *
 * 再充当设计者（对一维数组进行封装——提供增删改查的方法）
 */

public class MyArray {
    private int[] element;
    private int size;//用来记录有效个数，记录当前数组中有效数字的个数
    private final static int INITSIZE=10;   //final static 修饰常量，INITSIZE一旦赋值后，就不允许被修改

    public MyArray(){//构造方法专门用来初始化的
       this(INITSIZE);    //代码中一般不允许出现常量，所以设置常量
    }
    public MyArray(int count){
        element=new int[count];
    }

    private void ensureCapacity(){
        //确保容量问题
        if(size==element.length){
            element=Arrays.copyOf(element,(element.length>>1)+element.length);  //一般情况下，容量扩大1.5倍
        }
    }
    /**
     * 头部添加操作
     * @param value
     */
    public void addHead(int value){
        //   if(element==null)  //不需要条件判断，不管使用哪一个构造方法都已经创建了一个数组
        //1、考虑数组是否需要扩容 Arrays.copyOf()
        ensureCapacity();
        //2、放值(移动数据 腾位置)
        for(int i=size-1;i>=0;i--){
            element[i+1]=element[i];
        }
        element[0]=value;
        size++;
    }

    /**
     * 尾部增加
     * @param value
     */
    public void addTail(int value){  //1 2 3 (4)
        ensureCapacity();
        element[size++]=value;
    }

    /**
     * 查找这个值是否存在
     * @param value
     * @return
     */
    public boolean contains(int value){
        for(int i=0;i<size;i++){
            if(element[i]==value){
                return true;
            }
        }
        return false;
    }

    /**
     * 删除指定元素的值
     * @param value
     */
    public void removeValue(int value) {
        if (isEmpty()) {
            return;
        }
        //删除分两步。1）查找该值  2)删除该值
        for (int i = 0; i < size; ) {
            if (element[i] == value) {
                //数据移动  1 2 2 2 3->1 2 2 3 3
                for (int j = i + 1; j < size-i; j++) {  //j < size-i  ——> 每删一次有效用户会在之前的基础上少一个，i可代表轮数
                    element[j - 1] = element[j];
                }
            }else{
                i++;  //不等于value时才i++，否则会出现漏删问题
            }
        }
    }



    //需要一个判断数组是否为空的函数
    public boolean isEmpty(){
        return size==0;
    }

    /**
     *头部删除操作
     */
    public void removeHead(){
        if(isEmpty()){
           return;
        }
        //1、数据移动    （从前向后依次往前移动一位，从而覆盖掉第一个元素达到头部删除的作用）
        for(int i=1;i<size;i++){
            element[i-1]=element[i];
        }
        //2、有效用户  size--操作
        size--;
    }

    /**文档注释在方法前 或在类的定义前
     * 尾部删除操作
     */
    public void removeTail(){
        if(isEmpty()){
            return;
        }
        size--;
    }

    /**
     * 修改值操作
     * @param srcValue 原来值
     * @param aimValue 被修改为aimValue
     */
    public void change(int srcValue,int aimValue){
        if(isEmpty()){
            return;
        }
        for(int i=0;i<size;i++){
            if(element[i]==srcValue){
                element[i]=aimValue;
            }
        }
    }
}

