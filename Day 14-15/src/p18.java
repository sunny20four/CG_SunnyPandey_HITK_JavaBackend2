import java.io.*;

public class p18 {

    public static void main(String[] args) {

        try(FileReader fr =
                    new FileReader("config.txt"))
        {

            int ch;

            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}