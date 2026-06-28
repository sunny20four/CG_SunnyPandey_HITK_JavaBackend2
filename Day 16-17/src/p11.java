public class p11 {

    static Object printer=new Object();
    static Object scanner=new Object();


    public static void main(String[] args) {


        Thread a =
                new Thread(() -> {

                    synchronized(printer) {

                        synchronized(scanner) {

                            System.out.println(
                                    "Employee A done");
                        }
                    }
                });


        Thread b =
                new Thread(() -> {

                    synchronized(printer) {

                        synchronized(scanner) {

                            System.out.println(
                                    "Employee B done");
                        }
                    }
                });


        a.start();
        b.start();
    }
}