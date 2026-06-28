import java.io.*;

public class p22 {


    static String getGrade(int marks)
    {
        if(marks>=90)
            return "A+";

        if(marks>=80)
            return "A";

        if(marks>=70)
            return "B";

        if(marks>=60)
            return "C";

        return "F";
    }


    public static void main(String[] args)
    {

        try(
                BufferedReader br =
                        new BufferedReader(
                                new FileReader("students.txt"));

                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter("results.txt"))
        )
        {

            String line;

            while((line=br.readLine())!=null)
            {

                String data[]=line.split(",");

                int marks =
                        Integer.parseInt(data[1]);

                bw.write(
                        data[0]+" "+
                                marks+" "+
                                getGrade(marks));

                bw.newLine();
            }

            System.out.println("Results written");

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}