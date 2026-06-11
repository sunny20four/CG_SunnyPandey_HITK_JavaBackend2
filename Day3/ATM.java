import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Balance = Rs. " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                balance += sc.nextDouble();
                System.out.println("Updated Balance = Rs. " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if(amount <= balance) {
                    balance -= amount;
                    System.out.println("Remaining Balance = Rs. " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}