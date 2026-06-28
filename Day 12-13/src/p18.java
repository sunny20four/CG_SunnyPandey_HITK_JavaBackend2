import java.util.*;

public class p18 {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",30);

        for(String k:map.keySet())
            System.out.println(k);

        for(Integer v:map.values())
            System.out.println(v);
    }
}