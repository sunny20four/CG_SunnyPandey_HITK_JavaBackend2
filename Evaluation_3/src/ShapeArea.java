abstract class Shape {

    abstract double calculateArea();

}

class Circle extends Shape {

    double r;

    Circle(double r){
        this.r=r;
    }

    double calculateArea(){
        return 3.14*r*r;
    }
}

class Rectangle extends Shape {

    double l,b;

    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }

    double calculateArea(){
        return l*b;
    }
}

class Triangle extends Shape {

    double b,h;

    Triangle(double b,double h){
        this.b=b;
        this.h=h;
    }

    double calculateArea(){
        return 0.5*b*h;
    }
}


public class ShapeArea {

    public static void main(String args[]){

        Shape s[]={
                new Circle(5),
                new Rectangle(10,5),
                new Triangle(8,6)
        };

        double total=0;

        for(Shape x:s){
            System.out.println(x.calculateArea());
            total+=x.calculateArea();
        }

        System.out.println("Total Area = "+total);
    }
}
