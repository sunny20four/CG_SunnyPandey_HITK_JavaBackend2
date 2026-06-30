import java.util.*;

class P6 {

    static class Employee {

        String name;
        int salary;

        Employee(String name,int salary){
            this.name=name;
            this.salary=salary;
        }

        public String toString(){
            return name+" "+salary;
        }
    }


    public static void main(String args[]) {


        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("Amit",50000));
        list.add(new Employee("Rahul",70000));
        list.add(new Employee("Neha",60000));


        list.sort((a,b)->a.salary-b.salary);


        for(Employee e:list)
            System.out.println(e);
    }
}