import java.util.*;

public class p6 {

    public static void main(String[] args) {

        Deque<Integer> queue =
                new ArrayDeque<>();

        queue.offer(101);
        queue.offer(102);
        queue.offer(103);


        System.out.println(
                "Next job: "+queue.peek());


        while(!queue.isEmpty()) {

            System.out.println(
                    "Printing job: "+queue.poll());
        }
    }
}