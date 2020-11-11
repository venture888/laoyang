package Study.bankkk;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {
    private BankCard[]element;
    private int size;
    public Bank(){
        element=new BankCard[10];

    }

    private boolean search(int id,int passwd){
        for(int i=0;i<size;i++){
            if(id==element[i].getId()&&passwd==element[i].getPasswd()){ //调用私有属性
                return true;
            }
        }
        return false;
    }

    private boolean login(int id,int passwd){
        return search(id,passwd);
    }

    private boolean register(int id,int passwd){
        if(size==element.length){
            element= Arrays.copyOf(element,element.length*2);
        }
        if(search(id,passwd)){
            return false;
        }
        element[size++]=new BankCard(id,passwd);
        return true;
    }


    public void operate(){
        while(true) {
        System.out.println("1.登录 2.注册 3.退出");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

            if (choice == 3) {
                break;
            }
            System.out.println("请输入账号 密码");
            int id = scanner.nextInt();
            int passwd = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean flag = login(id, passwd);
                    if(flag){
                        System.out.println("登录成功");
                    }else{
                        System.out.println("登录失败");
                    }

                    break;
                case 2:
                    register(id, passwd);
                    break;
            }
        }
    }
}
