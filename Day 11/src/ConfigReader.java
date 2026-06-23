import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("config.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Cannot read config: " + e.getMessage());
        }
    }
}
