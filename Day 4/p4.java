import java.util.Scanner;
public class p4 {
    public static void main(String [] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a positive number: ");
            num = sc.nextInt();
        }
        while(num<=0);
        System.out.println("You entered: "+num);
        }
    }

