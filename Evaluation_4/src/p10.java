interface Shape {

    void draw();

}


class Circle implements Shape {

    public void draw(){

        System.out.println("Circle");

    }

}


class Rectangle implements Shape {


    public void draw(){

        System.out.println("Rectangle");

    }

}



class ShapeFactory {


    static Shape getShape(String type){


        if(type.equalsIgnoreCase("circle"))

            return new Circle();


        else if(type.equalsIgnoreCase("rectangle"))

            return new Rectangle();


        return null;
    }

}



class Student {


    String name;
    int age;


    Student(String name,int age){

        this.name=name;
        this.age=age;

    }


    public String toString(){

        return name+" "+age;

    }



    static class Builder {


        String name;
        int age;



        Builder setName(String name){

            this.name=name;

            return this;
        }



        Builder setAge(int age){

            this.age=age;

            return this;

        }



        Student build(){

            return new Student(name,age);

        }

    }

}



public class p10 {


    public static void main(String args[]){


        Shape s=ShapeFactory.getShape("circle");

        s.draw();



        Student st=new Student.Builder()
                .setName("Amit")
                .setAge(20)
                .build();


        System.out.println(st);

    }

}