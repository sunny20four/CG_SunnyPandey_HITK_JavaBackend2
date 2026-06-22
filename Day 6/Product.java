package Day6;

public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Keyboard", 799.99);
        System.out.println(product);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}
