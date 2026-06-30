import java.util.*;
import java.util.stream.*;

class P7 {


    static class Product {

        String name;
        int price;


        Product(String name,int price){
            this.name=name;
            this.price=price;
        }


        public String toString(){
            return name+" "+price;
        }
    }


    public static void main(String args[]) {


        List<Product> products = Arrays.asList(

                new Product("Laptop",60000),
                new Product("Phone",30000),
                new Product("Mouse",1000),
                new Product("Keyboard",2000)

        );


        products.stream()
                .filter(p->p.price>2000)
                .map(p->p.name)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}