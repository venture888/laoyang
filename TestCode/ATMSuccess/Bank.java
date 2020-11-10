package TestCode.ATMSuccess;

import java.util.Arrays;

public class Bank {
    private BankCard[] cards;    //存放银行卡的数组
    private int size;   //有效用户数
    private static final int INITSIZE = 10;  //常量静态的只要一份就够了

    public Bank() {  //在无参构造函数中，通过this调用有参构造函数,实现开辟默认长度的空间
        this(INITSIZE);
    }

    public Bank(int num) {
        this.cards = new BankCard[num];
    }
    //转账时查找用户id
    public BankCard find(int id){
        for(int i=0;i<size;i++){
            if(cards[i].getId()==id){
                return cards[i];
            }
        }
        return null;
    }





    //查找方法
    public BankCard search(int id,int passwd){
        for(int i=0;i< size;i++){
            //将条件：i< cards.length 改为 i<size.  会出现NullPointerExeption——>空指针异常(因为引用数据类型的默认值都为空，获取它的id号为null就会出现异常)  空.getId（）就是空指针异常
            if(cards[i].getId()==id && cards[i].getPasswd()==passwd){
                return cards[i];
            }
        }
        return null;//没有找到，返回空
    }

    //扩容
    public void ensureCapatity(){
        if(cards.length==size){
            cards= Arrays.copyOf(cards,cards.length*2);  //类名.方法名   Arrays.copyOf()——>静态方法
        }
    }
    //增加新的注册信息
    public boolean addCard(int id,int passwd){
        //之前注册过，不能继续注册功能
        BankCard card=search(id,passwd);
        if(card!=null){//找到卡
            return false;
        }
        //万一格子满了，需要扩容
        ensureCapatity();
        cards[size++]=new BankCard(id,passwd);//后置++，先用值后++
        return  true;
    }
}





