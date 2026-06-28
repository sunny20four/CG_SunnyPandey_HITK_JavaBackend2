import java.util.*;

public class p11 {

    public static void main(String[] args) {


        List<String> arrayList =
                new ArrayList<>();


        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        arrayList.add(0,"Avocado");


        System.out.println(
                arrayList.get(2));


        arrayList.remove("Banana");


        System.out.println(
                arrayList);



        LinkedList<String> linkedList =
                new LinkedList<>();


        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");


        linkedList.addFirst("Fish");

        linkedList.addLast("Hamster");


        System.out.println(
                linkedList.getFirst());


        System.out.println(
                linkedList.getLast());


        linkedList.removeFirst();

        linkedList.removeLast();


        System.out.println(
                linkedList);
    }
}