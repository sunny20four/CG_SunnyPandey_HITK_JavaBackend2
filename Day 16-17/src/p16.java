import java.util.concurrent.*;

public class p16 {

    public static void main(String[] args) {


        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2);


        scheduler.schedule(() -> {

            System.out.println(
                    "Generating report");

        },10,TimeUnit.SECONDS);



        scheduler.scheduleAtFixedRate(() -> {

            System.out.println(
                    "Server health OK");

        },0,5,TimeUnit.SECONDS);



        scheduler.scheduleWithFixedDelay(() -> {

            System.out.println(
                    "Cleaning logs");

        },2,5,TimeUnit.SECONDS);
    }
}