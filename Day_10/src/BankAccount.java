public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawn Rs." + amount + " | Remaining: Rs." + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 5000);
        try {
            acc.withdraw(3000);
            acc.withdraw(4000);
        } catch (InsufficientFundsException e) {
            System.out.println("Bank Error: " + e.getMessage());
            System.out.println("You need Rs." + e.getShortfall() + " more.");
        }
    }
}
