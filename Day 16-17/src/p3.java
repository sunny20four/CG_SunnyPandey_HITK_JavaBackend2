public class p3 {

    public static void main(String[] args) {

        Thread reportThread =
                new Thread(() -> {

                    System.out.println(
                            "Generating monthly report");

                    System.out.println(
                            "Report sent");

                });

        reportThread.start();
    }
}