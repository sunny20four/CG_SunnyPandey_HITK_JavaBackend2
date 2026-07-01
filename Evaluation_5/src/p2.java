class Employee22 {
    protected String name;
    protected double salary;

    Employee22(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager22 extends Employee22 {
    private double bonus;

    Manager22(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}

public class p2 {
    public static void main(String[] args) {
        Employee22 e = new Employee22("Rahul", 30000);
        Employee22 m = new Manager22("Priya", 50000, 10000);

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}