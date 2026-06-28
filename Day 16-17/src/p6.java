class BankAccount {

    private int balance=1000;


    public void withdraw(int amount) {

        if(balance>=amount) {

            System.out.println(
                    Thread.currentThread().getName()+
                            " withdrawing "+amount);

            try {
                Thread.sleep(100);
            }
            catch(Exception e) {}

            balance-=amount;

            System.out.println(
                    "Balance "+balance);
        }
    }
}


public class p6 {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount();


        Thread t1 =
                new Thread(() ->
                        account.withdraw(800),
                        "ATM-1");


        Thread t2 =
                new Thread(() ->
                        account.withdraw(800),
                        "ATM-2");


        t1.start();
        t2.start();
    }
}