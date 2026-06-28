import java.util.*;

public class p21 {

    public static Map<String,Integer> count(String text) {

        HashMap<String,Integer> map=new HashMap<>();

        String words[]=text.toLowerCase()
                .replaceAll("[^a-z ]","")
                .split(" ");

        for(String w:words) {
            if(!w.isEmpty())
                map.merge(w,1,Integer::sum);
        }

        return map;
    }

    public static void main(String[] args) {

        String s="To be or not to be";

        Map<String,Integer> result=count(s);

        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
