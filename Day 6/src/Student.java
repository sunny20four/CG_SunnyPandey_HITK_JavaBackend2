public class Student {
    String name;
    int age;
    String course;
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Enrolled";
    }
    Student(String name,int age) {
        this.name=name;
        this.age=age;
        this.course="General";
    }
    Student(String name,int age,String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void show() {
        System.out.println(name + " | Age: " + age + " | Course: " + course);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Riya", 20);
        Student s3 = new Student("Aman", 22, "B.Tech CSE");
        s1.show();
        s2.show();
        s3.show();
    }
    }

