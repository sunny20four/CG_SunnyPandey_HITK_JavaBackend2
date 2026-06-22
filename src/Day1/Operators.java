package Day1;

public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        boolean result = a > 10 && b < 10;
        System.out.println("Logical AND: " + result);
        System.out.println("Logical OR: " + (a > 30 || b < 10));
        System.out.println("Logical NOT: " + !(a == b));

        String message = a > b ? "a is greater" : "b is greater";
        System.out.println(message);
    }
}
