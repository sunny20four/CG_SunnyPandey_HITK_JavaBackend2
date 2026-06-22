package Day5;

public class Student {
    int rollNumber;
    String name;
    double marks;

    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 1;
        student.name = "Neha";
        student.marks = 88.5;
        student.display();
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
