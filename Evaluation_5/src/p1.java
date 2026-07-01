class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class p1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(7000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}