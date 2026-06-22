package Day5;

public class ConstructorDemo {
    String name;
    int age;

    ConstructorDemo() {
        name = "Unknown";
        age = 0;
    }

    ConstructorDemo(String name) {
        this.name = name;
        age = 18;
    }

    ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorDemo first = new ConstructorDemo();
        ConstructorDemo second = new ConstructorDemo("Kiran");
        ConstructorDemo third = new ConstructorDemo("Meera", 22);

        first.display();
        second.display();
        third.display();
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
