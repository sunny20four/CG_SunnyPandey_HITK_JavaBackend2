import java.io.*;
public class p12 {
public static void main(String [] args) throws IOException
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int num;
    System.out.println("Enter a number :");
    num = Integer.parseInt(input.readLine());
    for(int i=1;i<=10;i++)
    {
        System.out.println(num+"*"+i+"="+num*i);
    }

}
}
