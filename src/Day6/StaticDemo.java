package Day6;

public class StaticDemo {
    static String college = "ABC College";
    String studentName;

    StaticDemo(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        StaticDemo first = new StaticDemo("Rahul");
        StaticDemo second = new StaticDemo("Sneha");
        first.display();
        second.display();
        showCollege();
    }

    void display() {
        System.out.println(studentName + " studies at " + college);
    }

    static void showCollege() {
        System.out.println("College: " + college);
    }
}
