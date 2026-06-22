package Day7;

public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.showParent();
        child.showChild();
    }
}

class Parent {
    void showParent() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Child class method");
    }
}
