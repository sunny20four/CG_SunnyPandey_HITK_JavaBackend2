public class BankAccount {

    private double balance;
    private String accountHolder;

    public BankAccount(String accountHolder, double initialBalance) {

        this.accountHolder = accountHolder;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Sneha", 1000);

        acc.deposit(500);
        acc.deposit(-100);
        acc.withdraw(2000);
        acc.withdraw(300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}