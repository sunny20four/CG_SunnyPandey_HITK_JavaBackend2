abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract void processPayment();
    public abstract boolean validatePayment();

    public void logTransaction() {
        System.out.println("[LOG] Transaction ID: " + transactionId + " | Amount: Rs." + amount);
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

class CreditCardPayment extends Payment {
    private String cardNumber;
    private int cvv;

    public CreditCardPayment(String txnId, double amount, String cardNumber, int cvv) {
        super(txnId, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public void processPayment() {
        System.out.println("Processing Credit Card payment of Rs." + getAmount());
        System.out.println("Card ending: " + cardNumber.substring(cardNumber.length()-4));
    }

    public boolean validatePayment() {
        return cardNumber.length() == 16 && cvv > 99 && cvv < 1000;
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String txnId, double amount, String upiId) {
        super(txnId, amount);
        this.upiId = upiId;
    }

    public void processPayment() {
        System.out.println("Processing UPI payment of Rs." + getAmount());
        System.out.println("UPI ID: " + upiId);
    }

    public boolean validatePayment() {
        return upiId != null && upiId.contains("@");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment cc = new CreditCardPayment("TXN001",5000,"1234567890123456",123);
        Payment upi = new UPIPayment("TXN002",1200,"user@paytm");

        if(cc.validatePayment()) {
            cc.processPayment();
            cc.logTransaction();
            cc.generateReceipt();
        }

        if(upi.validatePayment()) {
            upi.processPayment();
            upi.logTransaction();
        }
    }
}