import java.util.*;

public class p4 {


    Map<String,Integer> views =
            new HashMap<>();


    Map<String,Set<String>> users =
            new HashMap<>();


    void recordView(String product,String user) {

        views.put(product,
                views.getOrDefault(product,0)+1);


        users.computeIfAbsent(
                        product,k->new HashSet<>())
                .add(user);
    }


    List<Map.Entry<String,Integer>>
    topProducts(int n) {

        return views.entrySet()
                .stream()
                .sorted(
                        Map.Entry.<String,Integer>
                                        comparingByValue()
                                .reversed())
                .limit(n)
                .toList();
    }


    public static void main(String[] args) {

        p4 tracker=new p4();


        tracker.recordView("P001","u1");
        tracker.recordView("P001","u2");
        tracker.recordView("P002","u1");
        tracker.recordView("P001","u3");


        tracker.topProducts(2)
                .forEach(System.out::println);
    }
}