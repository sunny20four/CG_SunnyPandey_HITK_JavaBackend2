import java.util.concurrent.*;

public class p18 {

    public static void main(String[] args)
            throws Exception {


        ExecutorService executor =
                Executors.newFixedThreadPool(
                        Runtime.getRuntime()
                                .availableProcessors());


        try {

            Future<String> result =
                    executor.submit(() -> {

                        return "Processing completed";
                    });


            System.out.println(
                    result.get(5,
                            TimeUnit.SECONDS));

        }
        catch(TimeoutException e) {

            System.out.println(
                    "Task timeout");
        }
        catch(ExecutionException e) {

            System.out.println(
                    e.getCause());
        }
        finally {

            executor.shutdown();

            if(!executor.awaitTermination(
                    10,TimeUnit.SECONDS)) {

                executor.shutdownNow();
            }
        }
    }
}