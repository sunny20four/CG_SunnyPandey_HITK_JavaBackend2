import java.util.*;

public class p23 {
    public static void main(String[] args) {

        String text="java is easy and java is popular";

        String words[]=text.split(" ");

        HashSet<String> stop=new HashSet<>();

        stop.add("is");
        stop.add("and");

        HashMap<String,Integer> freq=new HashMap<>();

        for(String w:words) {

            if(!stop.contains(w)) {
                freq.put(w,freq.getOrDefault(w,0)+1);
            }
        }

        System.out.println(freq);
    }
}