package Day2;

public class EmployeeValidator {
    public static void main(String[] args) {
        String employeeCode = "EMP-Sales-102";

        boolean startsCorrectly = employeeCode.startsWith("EMP");
        boolean hasDepartment = employeeCode.contains("Sales");
        boolean endsWithNumber = Character.isDigit(employeeCode.charAt(employeeCode.length() - 1));

        System.out.println("Starts with EMP: " + startsCorrectly);
        System.out.println("Contains department: " + hasDepartment);
        System.out.println("Ends with number: " + endsWithNumber);
        System.out.println("Valid Employee Code: " + (startsCorrectly && hasDepartment && endsWithNumber));
    }
}
