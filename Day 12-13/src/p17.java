import java.util.*;

public class p17 {
    public static void main(String[] args) {

        TreeMap<Integer,String> grades=new TreeMap<>();

        grades.put(90,"A");
        grades.put(70,"B");
        grades.put(50,"C");

        System.out.println(grades.floorKey(80));
        System.out.println(grades.ceilingKey(80));
    }
}