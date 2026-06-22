import java.util.ArrayList;
import java.util.Iterator;

public class Iterator11 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Iterator<String> it = fruits.iterator();

        while(it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }

        Iterator<String> it2 = fruits.iterator();

        while(it2.hasNext()) {
            if(it2.next().startsWith("B")) {
                it2.remove();
            }
        }

        System.out.println(fruits);
    }
}