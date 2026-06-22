package Day6;

public class ClassObject {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Basics";
        book.price = 299.50;
        book.display();
    }
}

class Book {
    String title;
    double price;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
