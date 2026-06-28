import java.util.*;

public class p6 {
    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");

        for(int i=0;i<cities.size();i++)
            System.out.println(cities.get(i));


        for(String c:cities)
            System.out.println(c);


        Iterator<String> it=cities.iterator();

        while(it.hasNext())
            System.out.println(it.next());


        ListIterator<String> li=cities.listIterator();

        while(li.hasNext())
            System.out.println(li.next());
    }
}