import java.io.*;

public class FileProcessor {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("report.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("First line: " + line);
            br.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
