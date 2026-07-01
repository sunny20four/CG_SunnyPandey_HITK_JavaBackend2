class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class p7 {
    public static void main(String[] args) {
        Student s = new Student(101, "Anjali");
        System.out.println(s);
    }
}