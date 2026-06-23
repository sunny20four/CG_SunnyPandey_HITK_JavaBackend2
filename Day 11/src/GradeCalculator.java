import java.io.*;

public class GradeCalculator {
    static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        return "F";
    }

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"))
        ) {
            bw.write("Name        Marks  Grade  Result");
            bw.newLine();
            bw.write("--------    -----  -----  ------");
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int marks = Integer.parseInt(parts[1].trim());
                String grade = getGrade(marks);
                String result = marks >= 60 ? "PASS" : "FAIL";

                bw.write(String.format("%-12s %-6d %-6s %s%n", name, marks, grade, result));
            }
            System.out.println("Results written to results.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
