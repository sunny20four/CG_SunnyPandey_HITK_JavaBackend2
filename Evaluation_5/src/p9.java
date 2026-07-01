abstract class Person {
    abstract void displayRole();
}

class Student122 extends Person {
    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }
}

class Faculty extends Person {
    @Override
    void displayRole() {
        System.out.println("Role: Faculty");
    }
}

public class p9 {
    public static void main(String[] args) {
        Person p1 = new Student122();
        Person p2 = new Faculty();

        p1.displayRole();
        p2.displayRole();
    }
}