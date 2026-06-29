enum Database2 {

    INSTANCE;


    void connect() {

        System.out.println(
                "Connected");
    }
}


public class p15 {

    public static void main(String[] args) {


        Database2 db =
                Database2.INSTANCE;


        db.connect();
    }
}