import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 95);
        scores.put("Bob", 82);
        scores.put("Charlie", 91);
        scores.put("Diana", 78);

        System.out.println(scores);

        Integer old = scores.put("Alice", 99);

        System.out.println(old);
        System.out.println(scores.get("Alice"));

        System.out.println(scores.get("Bob"));
        System.out.println(scores.getOrDefault("Zara", 0));

        System.out.println(scores.containsKey("Bob"));
        System.out.println(scores.containsValue(82));

        scores.remove("Diana");

        System.out.println(scores.size());

        System.out.println(scores.keySet());
        System.out.println(scores.values());

        for(Map.Entry<String,Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        scores.forEach((name,score)->{
            System.out.println(name+" scored "+score);
        });
    }
}
