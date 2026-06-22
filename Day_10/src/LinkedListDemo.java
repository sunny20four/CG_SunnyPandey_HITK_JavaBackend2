import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addLast("B");
        list.addLast("C");
        list.addFirst("A");
        list.addFirst("O");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.addLast("C");
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        list.push("Z");
        System.out.println(list.pop());
    }
}
