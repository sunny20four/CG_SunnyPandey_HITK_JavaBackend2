import java.util.*;
import java.util.stream.*;

public class p10 {

    public static void main(String[] args) {


        List<String> names =
                Arrays.asList(
                        "apple","banana","orange");


        List<String> result =
                names.stream()

                        .filter(x -> x.length()>5)

                        .collect(Collectors.toList());


        System.out.println(result);
    }
}