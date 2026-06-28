import java.io.*;

public class p24 {

    public static void main(String[] args)
    {

        try(BufferedReader br =
                    new BufferedReader(
                            new FileReader("app.log")))
        {

            String line;

            while((line=br.readLine())!=null)
            {

                if(line.contains("ERROR"))
                    System.out.println(line);
            }

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}