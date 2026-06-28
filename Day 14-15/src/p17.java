import java.io.*;

public class p17 {

    public static void main(String[] args) {

        try(FileWriter fw =
                    new FileWriter("application.log",true))
        {

            fw.write("Application started\n");
            fw.write("User logged in\n");

            System.out.println("Written");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}