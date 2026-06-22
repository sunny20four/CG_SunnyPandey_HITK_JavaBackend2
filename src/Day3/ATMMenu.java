package Day3;

import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    balance += scanner.nextDouble();
                    System.out.println("Deposit successful");
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double amount = scanner.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdraw successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        scanner.close();
    }
}
