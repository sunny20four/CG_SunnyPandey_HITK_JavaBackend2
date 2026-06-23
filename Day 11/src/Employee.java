import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private double salary;
    private transient String password;

    public Employee(int id, String name, String dept, double salary, String password) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
        this.password = password;
    }

    public String toString() {
        return String.format("Employee{id=%d, name='%s', dept='%s', salary=%.2f, password='%s'}",
            id, name, department, salary, password);
    }
}
