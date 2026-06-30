import java.util.*;

class P8 {

    public static void main(String args[]) {


        List<Integer> salary = Arrays.asList(
                30000,40000,50000,60000
        );


        int total = salary.stream()
                .reduce(0,(a,b)->a+b);


        System.out.println(total);
    }
}