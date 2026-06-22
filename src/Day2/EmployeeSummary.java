package Day2;

public class EmployeeSummary {
    public static void main(String[] args) {
        String name = "Amit";
        String department = "IT";
        double salary = 62000.50;
        boolean active = true;

        String status = active ? "Active" : "Inactive";
        String summary = String.format("Employee: %s | Department: %s | Salary: %.2f | Status: %s", name, department, salary, status);

        System.out.println(summary);
    }
}
