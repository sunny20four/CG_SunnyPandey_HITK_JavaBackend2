import java.util.*;

public class p20 {
    public static void main(String[] args) {

        String text="java is easy java is powerful";

        String words[]=text.split(" ");

        HashMap<String,Integer> freq=new HashMap<>();

        for(String w:words) {
            freq.put(w,freq.getOrDefault(w,0)+1);
        }

        for(Map.Entry<String,Integer> e:freq.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}