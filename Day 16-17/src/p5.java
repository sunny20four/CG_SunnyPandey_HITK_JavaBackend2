public class p5 {

    public static void main(String[] args)
            throws Exception {


        Thread t =
                new Thread(() -> {

                    System.out.println("Running");

                    try {
                        Thread.sleep(2000);
                    }
                    catch(Exception e) {}

                });


        t.setPriority(8);

        System.out.println(t.isAlive());

        t.start();

        System.out.println(t.isAlive());

        t.join();

        System.out.println(t.isAlive());
    }
}