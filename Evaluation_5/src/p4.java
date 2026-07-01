class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product(String name, double price, double discount) {
        this.name = name;
        this.price = price - (price * discount / 100);
    }

    void display() {
        System.out.println(name + " Price: " + price);
    }
}

public class p4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 30000, 10);

        p1.display();
        p2.display();
    }
}