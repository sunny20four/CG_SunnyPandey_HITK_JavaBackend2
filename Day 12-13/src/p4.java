import java.util.*;

public class p4 {
    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<>();

        history.addFirst("google.com");
        history.addFirst("youtube.com");
        history.addFirst("github.com");

        System.out.println(history);

        System.out.println("Leaving "+history.removeFirst());
        System.out.println("Now "+history.getFirst());

        System.out.println("Leaving "+history.removeFirst());
        System.out.println("Now "+history.getFirst());
    }
}