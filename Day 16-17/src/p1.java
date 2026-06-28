class PaymentProcessor extends Thread {

    String orderId;
    double amount;

    PaymentProcessor(String orderId,double amount) {
        this.orderId=orderId;
        this.amount=amount;
    }

    public void run() {

        System.out.println(
                Thread.currentThread().getName()+
                        " Processing payment for "+orderId);

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
                Thread.currentThread().getName()+
                        " Payment completed "+amount);
    }
}


public class p1 {

    public static void main(String[] args) {

        PaymentProcessor t1 =
                new PaymentProcessor("ORD-001",150);

        PaymentProcessor t2 =
                new PaymentProcessor("ORD-002",320);

        t1.setName("PaymentThread-1");
        t2.setName("PaymentThread-2");

        t1.start();
        t2.start();
    }
}