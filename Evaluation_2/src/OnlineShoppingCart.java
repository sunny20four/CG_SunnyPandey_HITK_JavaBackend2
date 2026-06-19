class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double calculateDiscount() {
        return 0;
    }
}

class Electronics extends Product {
    Electronics(double price) {
        super(price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(double price) {
        super(price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {
    Grocery(double price) {
        super(price);
    }

    double calculateDiscount() {
        return price * 0.05;
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(50000),
                new Clothing(3000),
                new Grocery(2000)
        };

        for (Product p : products) {
            System.out.println("Discount: " + p.calculateDiscount());
        }
    }
}