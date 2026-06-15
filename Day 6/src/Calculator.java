public class Calculator {

    int add(int a, int b) {

        System.out.println("Calling: add(int, int)");
        return a + b;

    }

    int add(int a, int b, int c) {

        System.out.println("Calling: add(int, int, int)");
        return a + b + c;

    }

    double add(double a, double b) {

        System.out.println("Calling: add(double, double)");
        return a + b;

    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 10));
        System.out.println("Result: " + calc.add(5, 10, 15));
        System.out.println("Result: " + calc.add(5.5, 2.5));

    }

}