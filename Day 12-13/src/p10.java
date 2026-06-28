import java.util.*;

public class p10 {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();

        map.put("India",100);
        map.put("USA",50);
        map.put("China",90);

        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}