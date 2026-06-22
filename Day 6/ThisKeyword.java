package Day6;

public class ThisKeyword {
    String name;
    int age;

    ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ThisKeyword person = new ThisKeyword("Arun", 24);
        person.show();
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
