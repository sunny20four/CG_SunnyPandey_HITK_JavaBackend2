import java.util.*;

public class p15 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> cache=
                new LinkedHashMap<>(16,0.75f,true);

        cache.put(1,"Page1");
        cache.put(2,"Page2");
        cache.put(3,"Page3");

        cache.get(1);

        cache.put(4,"Page4");

        System.out.println(cache);
    }
}