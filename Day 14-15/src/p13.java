import java.io.*;
import java.sql.*;

public class p13 {

    public static void main(String[] args) {

        try {

            FileReader fr =
                    new FileReader("data.txt");

            int x=10/0;

        }
        catch(IOException | ArithmeticException e) {

            System.out.println(e.getMessage());
        }
    }
}