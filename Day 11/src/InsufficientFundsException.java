public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient funds! Short by Rs." + amount);
        this.amount = amount;
    }

    public double getShortfall() {
        return amount;
    }
}
