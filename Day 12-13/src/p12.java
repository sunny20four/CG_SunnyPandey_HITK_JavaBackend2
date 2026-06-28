import java.util.*;

public class p12 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");

        HashSet<String> unique=new HashSet<>(list);

        System.out.println(unique);
    }
}
