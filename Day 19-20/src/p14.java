class Database {

    private static Database obj;


    private Database() {

    }


    public static Database getInstance() {

        if(obj==null)

            obj=new Database();


        return obj;
    }


    void connect() {

        System.out.println(
                "Database Connected");
    }
}


public class p14 {

    public static void main(String[] args) {


        Database d1 =
                Database.getInstance();


        Database d2 =
                Database.getInstance();


        System.out.println(
                d1==d2);


        d1.connect();
    }
}