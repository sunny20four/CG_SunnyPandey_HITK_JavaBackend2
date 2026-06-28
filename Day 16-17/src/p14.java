import java.util.concurrent.*;

public class p14 {


    static Callable<Double> price(
            String name,double value) {

        return () -> {

            System.out.println(
                    Thread.currentThread()
                            .getName()+
                            " Fetching "+name);


            Thread.sleep(1500);

            return value;
        };
    }


    public static void main(String[] args)
            throws Exception {


        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        Future<Double> a =
                executor.submit(
                        price("AAPL",185.5));


        Future<Double> b =
                executor.submit(
                        price("GOOGL",140.2));


        Future<Double> c =
                executor.submit(
                        price("MSFT",415.8));


        double total =
                a.get()+b.get()+c.get();


        System.out.println(
                "Total "+total);


        executor.shutdown();
    }
}