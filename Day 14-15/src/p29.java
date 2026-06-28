import java.io.*;

public class p29 {

    public static void main(String[] args)
    {

        String items[]={
                "Laptop",
                "Mouse",
                "Keyboard"
        };

        double price[]={
                55000,
                1000,
                2000
        };


        try(BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("invoice.txt")))
        {

            bw.write("INVOICE");
            bw.newLine();

            double total=0;

            for(int i=0;i<items.length;i++)
            {

                bw.write(
                        items[i]+" "+price[i]);

                bw.newLine();

                total+=price[i];
            }


            bw.write("Total = "+total);

            System.out.println("Invoice Generated");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}