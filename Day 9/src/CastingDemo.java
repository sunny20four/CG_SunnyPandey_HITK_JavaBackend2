class Animal{

    void eat(){
        System.out.println("Animal eating");
    }
}


class Dog extends Animal{

    void eat(){
        System.out.println("Dog eating");
    }

    void fetch(){
        System.out.println("Fetching ball");
    }
}


class Cat extends Animal{

    void eat(){
        System.out.println("Cat eating");
    }

    void sound(){
        System.out.println("Meow");
    }
}


public class CastingDemo{

    public static void main(String[] args){

        Dog d=new Dog();

        Animal a=d;

        a.eat();


        Animal x=new Dog();

        if(x instanceof Dog){

            Dog dog=(Dog)x;

            dog.fetch();
        }


        Animal y=new Cat();

        if(y instanceof Cat){

            Cat c=(Cat)y;

            c.sound();
        }
    }
}