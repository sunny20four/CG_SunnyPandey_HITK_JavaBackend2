import java.util.*;

class FoodItem {

    String name;
    double price;

    FoodItem(String name,double price){

        this.name=name;
        this.price=price;

    }
}


class Order {

    ArrayList<FoodItem> items=new ArrayList<>();


    void addFood(FoodItem f){

        items.add(f);

    }


    void removeFood(String n){

        for(FoodItem f:items){

            if(f.name.equals(n)){
                items.remove(f);
                break;
            }
        }
    }


    double total(){

        double t=0;

        for(FoodItem f:items)
            t+=f.price;

        return t;

    }


    void bill(){

        double t=total();

        double gst=t*0.05;

        double discount=t*0.10;

        System.out.println("Food Bill");

        for(FoodItem f:items)
            System.out.println(f.name+" "+f.price);


        System.out.println("GST: "+gst);
        System.out.println("Discount: "+discount);
        System.out.println("Final Amount: "+(t+gst-discount));

    }

}


class Customer {

    String name;

    Customer(String name){
        this.name=name;
    }

}


public class Restaurant {

    public static void main(String args[]){

        Customer c=new Customer("Amit");

        Order o=new Order();

        o.addFood(new FoodItem("Pizza",250));
        o.addFood(new FoodItem("Burger",120));
        o.addFood(new FoodItem("Cold Drink",50));

        System.out.println("Customer: "+c.name);

        o.bill();

    }
}
