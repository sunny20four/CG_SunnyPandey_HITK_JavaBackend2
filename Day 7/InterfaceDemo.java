package Day7;

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable printable = new Invoice();
        printable.print();
    }
}

interface Printable {
    void print();
}

class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("Printing invoice");
    }
}
