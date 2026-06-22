package Day7;

public class ShoppingCart {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics("Headphones", 2000),
                new Clothing("Shirt", 1200),
                new Grocery("Rice", 800)
        };

        double total = 0;
        for (Product product : products) {
            double finalPrice = product.getFinalPrice();
            total += finalPrice;
            System.out.println(product.name + " final price: " + finalPrice);
        }
        System.out.println("Cart Total: " + total);
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getDiscount() {
        return 0;
    }

    double getFinalPrice() {
        return price - getDiscount();
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double getDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double getDiscount() {
        return price * 0.15;
    }
}

class Grocery extends Product {
    Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    double getDiscount() {
        return price * 0.05;
    }
}
