abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base = 8;
    double height = 6;

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}