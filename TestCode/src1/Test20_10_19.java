package TestCode.src1;

public class Test20_10_19 {


    public static void main(String[] args) {
        People people=new People();
        People p=new People("zs",10,"man");
        String name=people.getName();  //底层：getName(people)
        System.out.println(name);
        people.eat("zs");

    }
    }
