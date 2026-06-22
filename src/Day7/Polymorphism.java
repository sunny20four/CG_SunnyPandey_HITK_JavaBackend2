package Day7;

public class Polymorphism {
    public static void main(String[] args) {
        Payment payment;
        payment = new CashPayment();
        payment.pay();
        payment = new CardPayment();
        payment.pay();
    }
}

class Payment {
    void pay() {
        System.out.println("Payment started");
    }
}

class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid by cash");
    }
}

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid by card");
    }
}
