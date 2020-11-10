package TestCode.ATMSuccess;

import java.util.Scanner;


public class ATM {
    private Bank bank;
    private static Scanner scanner=new Scanner(System.in);//将其定义为静态，只用声明一次，后面都可直接调用


    public ATM() {
        bank = new Bank();
    }


        //登录功能实现
    private BankCard login(int id,int passwd){
        //在银行中存在一张卡（card.id==id && card.passwd==passwd)
        return bank.search(id,passwd);

    }

    //注册功能实现
    private boolean register(int id, int passwd) {
        return bank.addCard(id,passwd);

    }


    public void loginSuccess(BankCard card) {
    System.out.println("1.存款 2.取款 3.查余额 4.转账 5.退卡");
    int chioce=scanner.nextInt();
    switch (chioce){
        case 1:
            System.out.println("请输入存款金额：");
            int money1=scanner.nextInt();//将money放置登录成功的那张卡上  card.money+=money
            card.saveMoney(money1);
            break;
        case 2:
            System.out.println("请输入取款金额：");
            int money2=scanner.nextInt();//将money放置登录成功的那张卡上  card.money+=money
            card.withDraw(money2);
            break;
        case 3:
            System.out.println("查询当前用户的余额："+card.getMoney());
            break;
        case 4:
            //转账：1)输入转账用户id，找到用户的卡userCard。请输入转账金额：100
            //card.withDraw(100);  重点：要判断，对方用户存在才可以进行操作—>对于对方加入100元 userCard.saveMoney(100)
            System.out.println("输入转入用户的id：");
            System.out.println("输入转入金额：");
            int id=scanner.nextInt();
            int money3=scanner.nextInt();
            BankCard card1=bank.find(id); //card1:转入用户
            card1.saveMoney(money3);
            card.withDraw(money3);
    }
    }



    public void start(){

        while(true) {  //给个死循环，可以运行一次，多次使用

            System.out.println("1.登录  2.注册  3.退出");
            int chioce = scanner.nextInt();
            if (chioce == 3) {
                break;
            }
            System.out.println("请输入账号和密码：");
            int id = scanner.nextInt();
            int passwd = scanner.nextInt();
            //账号和密码的获取（因为register和login都要使用，所以提出来写，直接给他们传值）


            switch (chioce) {      //switch语句定义的变量上面定义的，下面都可以用
                case 1:
                    BankCard card=login(id,passwd);
                    if (card!=null) {
                        System.out.println("登录成功");
                        //登录成功后，对money进行的多种操作
                        loginSuccess(card);

                    } else {
                        System.out.println("登录失败");
                    }
                    break;
                case 2:
                    if (register(id, passwd)) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("注册失败");
                    }
                    break;

            }
        }
    }
}
