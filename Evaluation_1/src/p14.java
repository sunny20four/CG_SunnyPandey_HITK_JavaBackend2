import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 100;
        int guess;
        System.out.println("Guess a number: ");

        while (true) {
            guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}