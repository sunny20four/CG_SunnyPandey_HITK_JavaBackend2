
import java.io.*;

public class p5 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("data.txt");
            BufferedReader br=new BufferedReader(fr);

            System.out.println(br.readLine());

            br.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}