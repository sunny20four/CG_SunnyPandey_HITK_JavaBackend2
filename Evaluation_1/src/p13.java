import java.io.*;
public class p13 {
    public static void main(String [] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num,sum=0;
        System.out.println("Enter a number :");
        num = Integer.parseInt(input.readLine());
        for(int i=1;i<=num;i++)
        {
            sum+=i;

        }
        System.out.println("Sum of first " + num + " numbers = " + sum);

    }
}
