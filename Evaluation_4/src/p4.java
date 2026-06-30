import java.util.*;

class P4 {

    public static void main(String args[]) {

        String text = "java is easy java is powerful";

        HashMap<String,Integer> map = new HashMap<>();

        String words[] = text.split(" ");

        for(String word : words) {

            if(word.length()==0)
                continue;

            map.put(word, map.getOrDefault(word,0)+1);
        }

        System.out.println(map);
    }
}