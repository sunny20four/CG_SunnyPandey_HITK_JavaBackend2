class DatabaseConnection implements AutoCloseable {

    public DatabaseConnection()
    {
        System.out.println("Database Connected");
    }


    public void execute()
    {
        System.out.println("Query Executed");
    }


    public void close()
    {
        System.out.println("Database Closed");
    }
}


public class p30 {

    public static void main(String[] args)
    {

        try(DatabaseConnection db =
                    new DatabaseConnection())
        {

            db.execute();

        }
    }
}