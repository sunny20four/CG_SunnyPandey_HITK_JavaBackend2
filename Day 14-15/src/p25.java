import java.io.*;

public class p25 {

    public static void main(String[] args)
    {

        int lines=0;
        int words=0;
        int chars=0;


        try(BufferedReader br =
                    new BufferedReader(
                            new FileReader("data.txt")))
        {

            String line;

            while((line=br.readLine())!=null)
            {
                lines++;

                chars += line.length();

                if(!line.trim().isEmpty())
                    words += line.trim()
                            .split("\\s+").length;
            }


            System.out.println("Lines: "+lines);
            System.out.println("Words: "+words);
            System.out.println("Characters: "+chars);

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}