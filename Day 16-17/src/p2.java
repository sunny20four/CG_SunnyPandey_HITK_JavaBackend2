class EmailNotifier implements Runnable {

    String email;
    String message;

    EmailNotifier(String email,String message) {
        this.email=email;
        this.message=message;
    }

    public void run() {

        System.out.println(
                Thread.currentThread().getName()+
                        " Sending email to "+email);

        try {
            Thread.sleep(1500);
        }
        catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Email sent");
    }
}


class SMSNotifier implements Runnable {

    String phone;

    SMSNotifier(String phone) {
        this.phone=phone;
    }

    public void run() {

        System.out.println(
                Thread.currentThread().getName()+
                        " Sending SMS to "+phone);
    }
}


public class p2 {

    public static void main(String[] args) {

        Thread t1 =
                new Thread(
                        new EmailNotifier("user@gmail.com",
                                "Order Confirmed"),
                        "EmailThread");


        Thread t2 =
                new Thread(
                        new SMSNotifier("+91-9876543210"),
                        "SMSThread");


        t1.start();
        t2.start();
    }
}