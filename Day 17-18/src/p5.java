import java.util.*;

public class p5 {

    public static void main(String[] args) {

        Queue<String> bankQueue =
                new LinkedList<>();

        bankQueue.offer("Alice");
        bankQueue.offer("Bob");
        bankQueue.offer("Charlie");

        System.out.println(
                bankQueue.peek());

        System.out.println(
                bankQueue.poll());

        System.out.println(
                bankQueue.poll());

        System.out.println(
                bankQueue);

        System.out.println(
                bankQueue.size());
    }
}