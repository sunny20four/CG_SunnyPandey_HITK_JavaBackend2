import java.io.*;

public class p15 {

    public static void main(String[] args) {


        try(
                BufferedReader br =
                        new BufferedReader(
                                new FileReader("source.txt"));

                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter("dest.txt"))
        )
        {

            String line;

            while((line=br.readLine())!=null)
            {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Copied");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}