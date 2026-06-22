package Day5;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.add(12, 4));
        System.out.println("Subtract: " + calculator.subtract(12, 4));
        System.out.println("Multiply: " + calculator.multiply(12, 4));
        System.out.println("Divide: " + calculator.divide(12, 4));
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (double) a / b;
    }
}
