import java.io.*;

public class DocumentLoader {
    public static String loadDocument(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();
        return content.toString();
    }

    public static void main(String[] args) {
        try {
            String doc = loadDocument("contract.txt");
            System.out.println(doc);
        } catch (IOException e) {
            System.out.println("Could not load document: " + e.getMessage());
        }
    }
}
