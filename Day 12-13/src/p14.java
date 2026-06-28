
import java.util.*;

public class p14 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> menu=new LinkedHashMap<>();

        menu.put("Burger",120);
        menu.put("Pizza",250);
        menu.put("Pasta",180);

        for(Map.Entry<String,Integer> e:menu.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}