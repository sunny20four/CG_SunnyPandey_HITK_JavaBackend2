import java.io.*;

public class p20 {

    public static void main(String[] args)
    {

        try(BufferedReader br =
                    new BufferedReader(
                            new FileReader("sales_report.txt")))
        {

            String line;

            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}