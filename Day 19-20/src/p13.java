import java.util.*;

class Sale {

    String product;
    double amount;


    Sale(String product,double amount) {

        this.product=product;
        this.amount=amount;
    }


    public String toString() {

        return product+" "+amount;
    }
}


public class p13 {

    public static void main(String[] args) {


        List<Sale> sales =
                Arrays.asList(

                        new Sale("Laptop",50000),
                        new Sale("Mobile",30000),
                        new Sale("Tablet",20000),
                        new Sale("Laptop",45000)
                );


        double total =
                sales.stream()

                        .mapToDouble(s->s.amount)

                        .sum();


        System.out.println(
                "Total Sales "+total);



        sales.stream()

                .filter(s->s.amount>25000)

                .forEach(System.out::println);
    }
}