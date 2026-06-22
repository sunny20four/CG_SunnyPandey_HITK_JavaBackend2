package Day4;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("Break example: " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Continue example: " + i);
        }
    }
}
