public class p10 {

    static Object printer=new Object();
    static Object scanner=new Object();


    public static void main(String[] args) {


        Thread a =
                new Thread(() -> {

                    synchronized(printer) {

                        System.out.println(
                                "Employee A printer");

                        try {
                            Thread.sleep(100);
                        }
                        catch(Exception e){}


                        synchronized(scanner) {

                            System.out.println(
                                    "Employee A scanner");
                        }
                    }

                });


        Thread b =
                new Thread(() -> {

                    synchronized(scanner) {

                        System.out.println(
                                "Employee B scanner");


                        try {
                            Thread.sleep(100);
                        }
                        catch(Exception e){}


                        synchronized(printer) {

                            System.out.println(
                                    "Employee B printer");
                        }
                    }

                });


        a.start();
        b.start();
    }
}