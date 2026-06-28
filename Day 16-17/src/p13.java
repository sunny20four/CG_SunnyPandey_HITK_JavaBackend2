import java.util.concurrent.*;

public class p13 {

    public static void main(String[] args)
            throws Exception {


        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        String images[]={
                "img1.jpg",
                "img2.png",
                "img3.jpg",
                "img4.png",
                "img5.jpg"
        };


        for(String image:images) {

            executor.submit(() -> {

                String name =
                        Thread.currentThread().getName();

                System.out.println(
                        name+" Compressing "+image);


                try {
                    Thread.sleep(1000);
                }
                catch(Exception e){}


                System.out.println(
                        name+" Done "+image);
            });
        }


        executor.shutdown();

        executor.awaitTermination(
                30,TimeUnit.SECONDS);


        System.out.println(
                "All images processed");
    }
}