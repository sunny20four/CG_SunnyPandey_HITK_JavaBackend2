import java.util.*;

public class p5 {

    public static void main(String[] args) {

        int n=10000;

        List<Integer> a=new ArrayList<>();
        List<Integer> b=new LinkedList<>();

        long start=System.nanoTime();

        for(int i=0;i<n;i++)
            a.add(0,i);

        long x=System.nanoTime()-start;


        start=System.nanoTime();

        for(int i=0;i<n;i++)
            b.add(0,i);

        long y=System.nanoTime()-start;


        System.out.println("ArrayList "+x);
        System.out.println("LinkedList "+y);
    }
}