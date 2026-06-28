
import java.util.*;

public class p7 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cat");

        Iterator<String> it=list.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Banana"))
                it.remove();
        }

        System.out.println(list);
    }
}