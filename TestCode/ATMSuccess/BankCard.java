package TestCode.ATMSuccess;

public class BankCard {
    private  int id;
    private int passwd;
    private int money;

    public BankCard(int id, int passwd) {   //初始化id，passwd
        this.id = id;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public int getPasswd() {
        return passwd;
    }

    public int getMoney() {
        return money;
    }
    public void saveMoney(int money){
        this.money+=money;
    }
    public void withDraw(int money){
        this.money-=money;
        System.out.println("当前余额："+this.money);
    }
}
