import java.io.*;

public class p21 {

    public static void main(String[] args)
    {

        try(BufferedReader br =
                    new BufferedReader(
                            new FileReader("sales.csv")))
        {

            String line;

            while((line=br.readLine())!=null)
            {

                String data[]=line.split(",");

                for(String s:data)
                    System.out.print(s+" ");

                System.out.println();
            }

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}