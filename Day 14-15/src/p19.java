import java.io.*;

public class p19 {

    public static void main(String[] args)
    {

        try(BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("sales_report.txt")))
        {

            bw.write("Monthly Sales Report");
            bw.newLine();

            bw.write("Product,Units,Revenue");
            bw.newLine();

            bw.write("Laptop,120,144000");
            bw.newLine();

            bw.write("Phone,340,170000");

            System.out.println("Report Generated");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}