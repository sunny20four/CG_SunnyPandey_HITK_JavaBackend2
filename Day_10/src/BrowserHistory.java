import java.util.LinkedList;

public class BrowserHistory {
    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<>();

        history.addFirst("Google.com");
        history.addFirst("Github.com");
        history.addFirst("Stackoverflow.com");

        System.out.println("History (most recent first):");
        System.out.println(history);

        System.out.println("\nClicking Back:");
        System.out.println("Leaving: " + history.removeFirst());
        System.out.println("Now at: " + history.getFirst());

        System.out.println("\nClicking Back:");
        System.out.println("Leaving: " + history.removeFirst());
        System.out.println("Now at: " + history.getFirst());
    }
}