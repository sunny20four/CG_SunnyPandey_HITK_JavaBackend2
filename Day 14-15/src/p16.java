import java.io.*;

public class p16 {

    public static void main(String[] args)
    {

        File file=new File("report.txt");


        System.out.println(file.exists());

        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.length());


        try {

            if(file.createNewFile())

                System.out.println("File created");

            else

                System.out.println("Already exists");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}