import java.util.*;

public class p19 {
    public static void main(String[] args) {

        HashMap<String,Integer> visits=new HashMap<>();

        visits.put("Page1",100);
        visits.put("Page2",200);
        visits.put("Page3",50);

        for(Map.Entry<String,Integer> e:visits.entrySet()) {
            e.setValue(e.getValue()+10);
        }

        System.out.println(visits);
    }
}
