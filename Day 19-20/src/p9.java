import java.util.*;

public class p9 {

    public static void main(String[] args) {


        List<String> names =
                Arrays.asList(
                        "java","python","cpp");


        names.stream()

                .map(String::toUpperCase)

                .forEach(System.out::println);
    }
}