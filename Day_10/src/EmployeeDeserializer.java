import java.io.*;

public class EmployeeDeserializer {
    public static Employee loadEmployee(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            Employee emp = (Employee) ois.readObject();
            return emp;
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        Employee emp = loadEmployee("employee.ser");
        System.out.println("After load: " + emp);
    }
}
