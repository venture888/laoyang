package Study.bankkk;

public class BankCard {
    private int id;
    private int passwd;

    public BankCard(int id, int passwd) {
        this.id = id;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public int getPasswd() {
        return passwd;
    }
}
