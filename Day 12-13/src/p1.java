import java.util.*;

public class p1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);

        System.out.println(fruits.get(1));

        fruits.remove("Banana");

        System.out.println(fruits);
        System.out.println(fruits.size());

        Iterator<String> it = fruits.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}