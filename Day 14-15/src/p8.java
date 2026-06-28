import java.io.*;

public class p8 {

    static void test() throws IOException,ArithmeticException {

        FileReader fr=new FileReader("data.txt");

        int x=10/0;
    }

    public static void main(String[] args) {

        try {
            test();
        }
        catch(IOException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}