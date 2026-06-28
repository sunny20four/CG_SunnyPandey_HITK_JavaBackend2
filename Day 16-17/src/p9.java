class PizzaRestaurant {

    boolean ready=false;


    synchronized void prepare()
            throws Exception {

        System.out.println("Preparing pizza");

        Thread.sleep(3000);

        ready=true;

        System.out.println("Pizza ready");

        notify();
    }


    synchronized void collect()
            throws Exception {

        while(!ready) {

            System.out.println(
                    "Waiting for pizza");

            wait();
        }

        System.out.println(
                "Pizza collected");
    }
}


public class p9 {

    public static void main(String[] args)
            throws Exception {


        PizzaRestaurant p =
                new PizzaRestaurant();


        Thread customer =
                new Thread(() -> {

                    try {
                        p.collect();
                    }
                    catch(Exception e){}

                });


        Thread chef =
                new Thread(() -> {

                    try {
                        p.prepare();
                    }
                    catch(Exception e){}

                });


        customer.start();

        Thread.sleep(500);

        chef.start();
    }
}