import java.io.*;

public class p7 {

    static String readFile(String name) throws IOException {

        FileReader fr=new FileReader(name);
        BufferedReader br=new BufferedReader(fr);

        return br.readLine();
    }

    public static void main(String[] args) {

        try {
            System.out.println(readFile("data.txt"));
        }
        catch(IOException e) {
            System.out.println("File error");
        }
    }
}