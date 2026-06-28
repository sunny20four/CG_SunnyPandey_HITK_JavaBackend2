import java.util.*;

public class p2 {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Page1");
        history.push("Page2");
        history.push("Page3");

        System.out.println(history.peek());
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.peek());
    }
}