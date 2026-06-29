import java.util.*;

public class p3 {


    public static char firstUnique(String s) {

        Map<Character,Integer> map =
                new LinkedHashMap<>();


        for(char c:s.toCharArray())

            map.put(c,
                    map.getOrDefault(c,0)+1);


        for(Map.Entry<Character,Integer> e:
                map.entrySet())

            if(e.getValue()==1)
                return e.getKey();


        return '\0';
    }


    public static void main(String[] args) {

        System.out.println(
                firstUnique("aabbcde"));
    }
}