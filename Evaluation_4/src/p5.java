import java.util.*;
class p5 {
    public static void main(String args[]) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Amit", 85);
        students.put("Rahul", 92);
        students.put("Neha", 88);
        students.put("Riya", 95);

        String topper = "";
        int max = 0;

        for (String name : students.keySet()) {
            int marks = students.get(name);
            if (marks > max) {
                max = marks;
                topper = name;
            }
        }
        System.out.println("Topper: " + topper);
        System.out.println("Marks: " + max);
    }
}