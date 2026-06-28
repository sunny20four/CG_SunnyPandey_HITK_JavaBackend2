import java.util.*;

public class p2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ananya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Dev");

        System.out.println(students);

        students.remove("Dev");

        students.add(1,"Meera");

        for(int i=0;i<students.size();i++) {
            System.out.println((i+1)+" "+students.get(i));
        }

        String search="Priya";

        if(students.contains(search)) {
            System.out.println(search+" found");
        }
    }
}