import java.util.*;
import java.nio.file.*;

public class p24 {

    public static void main(String[] args) throws Exception {

        String text=new String(
                Files.readAllBytes(Paths.get("article.txt"))
        );

        String words[]=text.split("\\s+");

        HashMap<String,Integer> map=new HashMap<>();

        for(String w:words) {
            map.put(w,map.getOrDefault(w,0)+1);
        }

        System.out.println(map);
    }
}