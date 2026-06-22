package Day6;

public class Overloading {
    public static void main(String[] args) {
        Overloading demo = new Overloading();
        System.out.println(demo.add(5, 10));
        System.out.println(demo.add(5, 10, 15));
        System.out.println(demo.add(5.5, 2.5));
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
