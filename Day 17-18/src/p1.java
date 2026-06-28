import java.util.*;

public class p1 {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("Page1");
        stack.push("Page2");
        stack.push("Page3");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}