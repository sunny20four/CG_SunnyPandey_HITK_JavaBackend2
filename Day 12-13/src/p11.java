import java.util.*;

public class p11 {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);

        System.out.println(set.contains("Java"));

        set.remove("Python");

        System.out.println(set);
    }
}