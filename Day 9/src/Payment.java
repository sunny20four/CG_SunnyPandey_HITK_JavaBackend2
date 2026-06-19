public abstract class Payment {
    private String transactionId;
    private double amount;
    public Payment(String transactionId,double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
        public abstract void processPayment();
    public void logTransaction () {
        System.out.println("[LOG] Transaction ID: "+ transactionId + " | Amount: Rs."+ amount);
    }
    public void generateReceipt() {
        System.out.println("Receipt generated for transaction: " + transactionId);
    }
    public double getAmount() {
        return amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    }
}
