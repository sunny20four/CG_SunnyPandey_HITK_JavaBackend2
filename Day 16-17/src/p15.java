import java.util.*;
import java.util.concurrent.*;

public class p15 {

    public static void main(String[] args)
            throws Exception {


        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        List<Callable<String>> tasks =
                Arrays.asList(

                        () -> {
                            Thread.sleep(2000);
                            return "Server A";
                        },

                        () -> {
                            Thread.sleep(500);
                            return "Server B";
                        },

                        () -> {
                            Thread.sleep(1000);
                            return "Server C";
                        });


        List<Future<String>> results =
                executor.invokeAll(tasks);


        for(Future<String> f:results)
            System.out.println(f.get());


        String fastest =
                executor.invokeAny(tasks);


        System.out.println(
                "Fastest "+fastest);


        executor.shutdown();
    }
}