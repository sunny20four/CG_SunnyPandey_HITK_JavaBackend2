import java.util.*;

class Electricity {

    String name;
    int id;
    int units;

    Electricity(String name,int id,int units){
        this.name=name;
        this.id=id;
        this.units=units;
    }

    double bill(){

        double amount=0;

        if(units<=100){
            amount=units*2;
        }
        else if(units<=300){
            amount=100*2+(units-100)*4;
        }
        else if(units<=500){
            amount=100*2+200*4+(units-300)*6;
        }
        else{
            amount=100*2+200*4+200*6+(units-500)*8;
        }

        return amount;
    }

    void display(){

        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Units: "+units);
        System.out.println("Bill: "+bill());

    }
}


public class ElectricityBill {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Name: ");
        String n=sc.nextLine();

        System.out.print("ID: ");
        int id=sc.nextInt();

        System.out.print("Units: ");
        int u=sc.nextInt();

        Electricity e=new Electricity(n,id,u);

        e.display();

    }
}
