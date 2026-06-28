import java.util.concurrent.*;

public class p17 {

    public static void main(String[] args)
            throws Exception {


        CompletableFuture<String> user =
                CompletableFuture.supplyAsync(() -> {

                    try {
                        Thread.sleep(1000);
                    }
                    catch(Exception e){}

                    return "User: John";

                });


        CompletableFuture<String> product =
                CompletableFuture.supplyAsync(() -> {

                    try {
                        Thread.sleep(800);
                    }
                    catch(Exception e){}

                    return "Product: Laptop";

                });



        CompletableFuture<String> order =
                user.thenCombine(product,
                        (u,p) -> u+" "+p);



        CompletableFuture<String> mail =
                order.thenApply(
                        x -> "Email sent "+x);



        mail.thenAccept(
                System.out::println);



        mail.get();
    }
}