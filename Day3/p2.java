import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = units * 7.5;

        System.out.printf("Total Bill = Rs. %.2f%n", bill);

        sc.close();
    }
}