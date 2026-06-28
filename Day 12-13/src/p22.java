import java.util.*;

public class p22 {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();

        map.put("java",5);
        map.put("python",3);
        map.put("cpp",2);
        map.put("html",1);

        int n=2;

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .limit(n)
                .forEach(System.out::println);
    }
}