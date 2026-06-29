interface Payment {

    void pay(double amount);
}


class CreditCard implements Payment {

    public void pay(double amount) {

        System.out.println(
                "Paid by Credit Card "+amount);
    }
}


class UPI implements Payment {

    public void pay(double amount) {

        System.out.println(
                "Paid by UPI "+amount);
    }
}


class PaymentFactory {

    static Payment create(String type) {


        if(type.equalsIgnoreCase("UPI"))

            return new UPI();


        return new CreditCard();
    }
}



public class p16 {

    public static void main(String[] args) {


        Payment p =
                PaymentFactory.create("UPI");


        p.pay(1000);
    }
}