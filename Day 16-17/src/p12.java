class Server {

    private volatile boolean running=true;


    void start() {

        new Thread(() -> {

            while(running) {

                System.out.println(
                        "Server running");

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){}
            }

            System.out.println(
                    "Server stopped");

        }).start();
    }


    void stop() {

        running=false;
    }
}


public class p12 {

    public static void main(String[] args)
            throws Exception {

        Server s=new Server();

        s.start();

        Thread.sleep(2000);

        s.stop();
    }
}