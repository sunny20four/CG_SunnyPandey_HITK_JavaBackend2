class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient funds! Short by Rs." + amount);
        this.amount = amount;
    }

    public double getShortfall() {
        return amount;
    }
}


public class p10 {

    private double balance;

    public p10(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount) throws InsufficientFundsException {

        if(amount > balance) {
            throw new InsufficientFundsException(amount-balance);
        }

        balance -= amount;

        System.out.println("Withdrawn Rs."+amount);
    }


    public static void main(String[] args) {

        p10 acc = new p10(5000);

        try {
            acc.withdraw(3000);
            acc.withdraw(4000);
        }
        catch(InsufficientFundsException e) {

            System.out.println(e.getMessage());
            System.out.println("Need Rs."+e.getShortfall()+" more");
        }
    }
}