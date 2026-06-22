package Day5;

public class MethodDemo {
    public static void main(String[] args) {
        greet();
        printName("Ravi");
        int total = add(10, 20);
        System.out.println("Total: " + total);
    }

    static void greet() {
        System.out.println("Welcome to Java methods");
    }

    static void printName(String name) {
        System.out.println("Name: " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
