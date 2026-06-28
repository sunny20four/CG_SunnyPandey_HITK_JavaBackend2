import java.util.*;

public class p4 {

    StringBuilder text =
            new StringBuilder();

    Deque<String> history =
            new ArrayDeque<>();


    void type(String word) {

        history.push(word);

        text.append(word);

        System.out.println(text);
    }


    void undo() {

        if(history.isEmpty()) {

            System.out.println(
                    "Nothing to undo!");

            return;
        }


        String last=history.pop();

        text.delete(
                text.length()-last.length(),
                text.length());

        System.out.println(
                text);
    }


    public static void main(String[] args) {

        p4 editor=new p4();

        editor.type("Hello ");
        editor.type("World");
        editor.type("!");

        editor.undo();
        editor.undo();
    }
}