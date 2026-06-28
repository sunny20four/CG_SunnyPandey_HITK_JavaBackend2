import java.util.*;

public class p3 {

    public static boolean isBalanced(String s) {

        Deque<Character> stack =
                new ArrayDeque<>();

        for(char ch:s.toCharArray()) {

            if(ch=='('||ch=='['||ch=='{') {
                stack.push(ch);
            }

            else if(ch==')'||ch==']'||ch=='}') {

                if(stack.isEmpty())
                    return false;

                char top=stack.pop();

                if(ch==')' && top!='(')
                    return false;

                if(ch==']' && top!='[')
                    return false;

                if(ch=='}' && top!='{')
                    return false;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {

        System.out.println(
                isBalanced("({[]})"));

        System.out.println(
                isBalanced("({)}"));

        System.out.println(
                isBalanced("[[[]]]"));

        System.out.println(
                isBalanced("((("));
    }
}