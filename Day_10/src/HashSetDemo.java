import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        System.out.println(set.add("Java"));
        System.out.println(set.add("Python"));
        System.out.println(set.add("Java"));

        set.add("C++");
        set.add("JavaScript");

        System.out.println(set);

        System.out.println(set.contains("Java"));
        System.out.println(set.contains("Ruby"));

        set.remove("C++");

        System.out.println(set);

        System.out.println(set.size());

        for(String lang : set) {
            System.out.println(lang);
        }

        HashSet<Integer> a =
                new HashSet<>(Arrays.asList(1,2,3,4));

        HashSet<Integer> b =
                new HashSet<>(Arrays.asList(3,4,5,6));


        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);

        System.out.println(union);


        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(intersection);


        HashSet<Integer> diff = new HashSet<>(a);
        diff.removeAll(b);

        System.out.println(diff);
    }
}