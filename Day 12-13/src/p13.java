import java.util.*;

public class p13 {
    public static void main(String[] args) {

        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(3);
        b.add(4);
        b.add(5);

        HashSet<Integer> union=new HashSet<>(a);
        union.addAll(b);

        HashSet<Integer> inter=new HashSet<>(a);
        inter.retainAll(b);

        HashSet<Integer> diff=new HashSet<>(a);
        diff.removeAll(b);

        System.out.println(union);
        System.out.println(inter);
        System.out.println(diff);
    }
}