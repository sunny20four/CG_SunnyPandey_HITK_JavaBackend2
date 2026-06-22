package Day3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = scanner.nextInt();
        double bill;

        if (units <= 100) {
            bill = units * 2.5;
        } else if (units <= 200) {
            bill = 100 * 2.5 + (units - 100) * 4;
        } else {
            bill = 100 * 2.5 + 100 * 4 + (units - 200) * 6;
        }

        System.out.println("Electricity Bill: " + bill);
        scanner.close();
    }
}
