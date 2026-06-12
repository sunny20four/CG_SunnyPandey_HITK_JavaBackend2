import java.io.*;

public class p11 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.print("Enter the number: ");
        num = Integer.parseInt(input.readLine());

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
