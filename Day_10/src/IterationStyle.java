import java.util.*;

public class IterationStyle {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bengaluru");

        System.out.println("--- Traditional for ---");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(i + ": " + cities.get(i));
        }

        System.out.println("--- for-each ---");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("--- Iterator ---");
        Iterator<String> it = cities.iterator();

        while (it.hasNext()) {
            String city = it.next();
            if (city.startsWith("C")) {
                it.remove();
            }
        }

        System.out.println(cities);

        System.out.println("--- ListIterator ---");
        ListIterator<String> lit = cities.listIterator();

        while (lit.hasNext()) {
            String city = lit.next();
            if (city.equals("Delhi")) {
                lit.set("Pune");
            }
        }

        System.out.println(cities);

        System.out.println("--- forEach lambda ---");
        cities.forEach(city -> System.out.println(city.toUpperCase()));

        cities.removeIf(city -> city.length() > 6);

        System.out.println("After removeIf: " + cities);
    }
}