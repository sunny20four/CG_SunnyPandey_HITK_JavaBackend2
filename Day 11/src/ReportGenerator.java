import java.io.*;

public class ReportGenerator {
    public static void generateSalesReport() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sales_report.txt"))) {
            bw.write("======== Monthly Sales Report ========");
            bw.newLine();
            bw.write("Region,Product,Units,Revenue");
            bw.newLine();
            bw.write("North,Laptop,120,Rs.144000");
            bw.newLine();
            bw.write("South,Phone,340,Rs.170000");
            bw.newLine();
            bw.write("East,Tablet,95,Rs.47500");
            bw.newLine();
            System.out.println("Report generated: sales_report.txt");
        }
    }
}
