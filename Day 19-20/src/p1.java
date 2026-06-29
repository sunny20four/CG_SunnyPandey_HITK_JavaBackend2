import java.util.*;

public class p1 {

    public static Map<String,Integer> wordFrequency(String s) {

        Map<String,Integer> map=new HashMap<>();

        String words[]=s.split(" ");

        for(String w:words)
            map.put(w,map.getOrDefault(w,0)+1);

        return map;
    }


    public static void main(String[] args) {

        System.out.println(
                wordFrequency(
                        "apple banana apple cherry banana apple"));
    }
}