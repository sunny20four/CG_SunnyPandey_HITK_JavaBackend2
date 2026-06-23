public class BankTransaction {
    public static void processPayment(double amount) {
        System.out.println("Opening DB connection...");
        try {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            System.out.println("Payment of Rs." + amount + " processed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Closing DB connection...");
        }
    }

    public static void main(String[] args) {
        processPayment(500.0);
        processPayment(-100.0);
    }
}
