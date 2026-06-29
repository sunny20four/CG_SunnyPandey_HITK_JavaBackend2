public class p5 {

    public static void main(String[] args) {


        Runnable r =
                () -> System.out.println(
                        "Hello Lambda");


        r.run();


        Thread t =
                new Thread(() ->
                        System.out.println(
                                "Thread using lambda"));


        t.start();
    }
}