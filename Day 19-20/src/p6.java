@FunctionalInterface
interface Calculator {

    int calculate(int a,int b);
}


public class p6 {

    public static void main(String[] args) {


        Calculator add =
                (a,b) -> a+b;


        Calculator multiply =
                (a,b) -> a*b;


        System.out.println(
                add.calculate(10,20));


        System.out.println(
                multiply.calculate(10,20));
    }
}