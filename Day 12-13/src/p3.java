import java.util.*;

public class p3 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.addLast("B");
        list.addLast("C");
        list.addFirst("A");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        list.addFirst("X");
        list.addLast("Y");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}