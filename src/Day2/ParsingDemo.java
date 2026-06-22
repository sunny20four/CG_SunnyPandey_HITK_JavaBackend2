package Day2;

public class ParsingDemo {
    public static void main(String[] args) {
        String ageText = "25";
        String salaryText = "35000.50";

        int age = Integer.parseInt(ageText);
        double salary = Double.parseDouble(salaryText);

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
