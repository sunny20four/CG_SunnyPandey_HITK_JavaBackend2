class Shape{

    String color;

    Shape(String color){
        this.color=color;
    }

    void draw(){
        System.out.println("Shape");
    }

    double area(){
        return 0;
    }
}


class Circle extends Shape{

    double r;

    Circle(String c,double r){
        super(c);
        this.r=r;
    }

    void draw(){
        System.out.println("Circle");
    }

    double area(){
        return 3.14*r*r;
    }
}


class Rectangle extends Shape{

    double l,b;

    Rectangle(String c,double l,double b){
        super(c);
        this.l=l;
        this.b=b;
    }

    void draw(){
        System.out.println("Rectangle");
    }

    double area(){
        return l*b;
    }
}


public class ShapeDemo{

    public static void main(String[] args){

        Shape[] s={
                new Circle("Red",5),
                new Rectangle("Blue",4,6)
        };

        for(Shape x:s){
            x.draw();
            System.out.println(x.area());
        }
    }
}