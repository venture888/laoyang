package TestCode.ATMSuccess;

/**
 * ATM机：Java完全面向对象编程
 */

//测试类main——>main测试方法7

public class TestDemo {
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.start();
        BankCard[] arr=new BankCard[10];
        System.out.println(arr[0].getId());
    }
}
