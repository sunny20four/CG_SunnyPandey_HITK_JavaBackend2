import java.util.*;

public class p8 {
    public static void main(String[] args) {

        HashMap<String,Integer> marks=new HashMap<>();

        marks.put("Alice",95);
        marks.put("Bob",82);
        marks.put("Charlie",91);

        System.out.println(marks);

        System.out.println(marks.get("Alice"));

        System.out.println(marks.containsKey("Bob"));

        marks.remove("Charlie");

        System.out.println(marks);
    }
}