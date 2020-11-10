package TestCode.src1;

public class Plane {
    String name;
    int number;
    String size;

    void fly(){
        System.out.println("起飞");
    }
    void down() {
        System.out.println("降落");
    }

        Plane(String name,int number,String size){
            this.name=name;
            this.number=number;
            this.size=size;
        }
    }
