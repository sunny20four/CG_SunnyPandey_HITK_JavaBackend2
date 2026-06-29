import java.util.*;

public class p12 {

    public static void main(String[] args) {


        List<Integer> nums =
                Arrays.asList(
                        1,2,3,4,5);


        int sum =
                nums.stream()

                        .reduce(0,
                                (a,b)->a+b);


        System.out.println(sum);
    }
}