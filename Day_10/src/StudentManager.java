import java.util.*;
public class StudentManager {
    public static void main(String [] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ananya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Dev");
        System.out.println("Enrolled: " + students);
        students.remove("Dev");
        System.out.println("After drop: " + students);
        students.add(1, "Meera");
        System.out.println("After transfer: " + students);
        System.out.println("\nRoll Call:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + "." + students.get(i));
        }
        String search = "Priya";
        if (students.contains(search)) {
            int pos = students.indexOf(search);
            System.out.println(search + " is at roll no " + (pos + 1));
        }
        }
    }
