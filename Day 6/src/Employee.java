public class Employee {
    String name;
    double salary;

    Employee() {
        this("Default Employee", 25000.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double bonus) {
        this.salary = this.salary + bonus;
    }

    void show() {
        System.out.println(this.name + "'s salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Karan", 40000);
        Employee e2 = new Employee();
        e1.raiseSalary(5000);
        e2.raiseSalary(2000);
        e1.show();
        e2.show();
    }
 }
