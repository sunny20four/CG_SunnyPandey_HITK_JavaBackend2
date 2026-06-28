class DatabaseException extends Exception {

    public DatabaseException(String msg, Throwable cause) {

        super(msg,cause);
    }
}


public class p12 {


    static void findUser() throws DatabaseException {

        try {

            throw new java.sql.SQLException("Connection failed");

        }
        catch(java.sql.SQLException e) {

            throw new DatabaseException(
                    "Unable to fetch user",e);
        }
    }


    public static void main(String[] args) {

        try {

            findUser();

        }
        catch(DatabaseException e) {

            System.out.println(e.getMessage());
        }
    }
}