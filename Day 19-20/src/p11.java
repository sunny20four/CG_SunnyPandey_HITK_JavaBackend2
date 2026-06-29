import java.util.*;

public class p11 {

    public static void main(String[] args) {


        List<Integer> numbers =
                Arrays.asList(
                        5,1,4,3,2);


        numbers.stream()

                .sorted()

                .forEach(System.out::println);
    }
}