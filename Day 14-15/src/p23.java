import java.io.*;

public class p23 {

    public static void main(String[] args)
    {

        try(BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("app.log",true)))
        {

            bw.write("[INFO] Server Started");
            bw.newLine();

            bw.write("[WARN] Memory High");
            bw.newLine();

            bw.write("[ERROR] Database Failed");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}