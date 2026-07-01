class Book {
    String title;
    static int count = 0;

    Book(String title) {
        this.title = title;
        count++;
    }

    static void displayCount() {
        System.out.println("Total Books: " + count);
    }
}

public class p6 {
    public static void main(String[] args) {
        new Book("Java");
        new Book("Python");
        new Book("C++");

        Book.displayCount();
    }
}