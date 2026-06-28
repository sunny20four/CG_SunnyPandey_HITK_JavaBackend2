import java.util.*;

public class p16 {
    public static void main(String[] args) {

        TreeMap<String,Integer> map=new TreeMap<>();

        map.put("Delhi",10);
        map.put("Mumbai",20);
        map.put("Chennai",15);

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}