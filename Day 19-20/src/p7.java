import java.util.*;

public class p7 {

    static void display(String s) {

        System.out.println(s);
    }


    public static void main(String[] args) {


        List<String> names =
                Arrays.asList(
                        "Ram","Shyam","John");


        names.forEach(
                p7::display);
    }
}