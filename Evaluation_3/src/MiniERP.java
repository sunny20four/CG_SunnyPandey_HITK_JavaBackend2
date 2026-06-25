import java.util.*;

interface Report {

    void generateReport();

}


abstract class Staff implements Report {

    int id;
    String name;
    double salary;


    Staff(int id,String name,double salary){

        this.id=id;
        this.name=name;
        this.salary=salary;

    }


    abstract double calculateSalary();


    public void generateReport(){

        System.out.println(id+" "+name+" "+calculateSalary());

    }

}


class Manager extends Staff {


    Manager(int id,String name,double salary){

        super(id,name,salary);

    }


    double calculateSalary(){

        return salary+5000;

    }

}


class Developer extends Staff {


    Developer(int id,String name,double salary){

        super(id,name,salary);

    }


    double calculateSalary(){

        return salary+3000;

    }

}


class Department {

    String name;


    Department(String name){

        this.name=name;

    }

}


class ERP {


    ArrayList<Staff> list=new ArrayList<>();


    void add(Staff s){

        list.add(s);

    }


    void search(int id){

        for(Staff s:list){

            if(s.id==id)
                s.generateReport();

        }

    }


    void highest(){

        Staff max=list.get(0);

        for(Staff s:list){

            if(s.calculateSalary()>max.calculateSalary())
                max=s;

        }

        max.generateReport();

    }


    void sort(){

        list.sort(
                (a,b)->Double.compare(
                        b.calculateSalary(),
                        a.calculateSalary()));

    }


    void display(){

        for(Staff s:list)
            s.generateReport();

    }

}


public class MiniERP {

    public static void main(String args[]){

        ERP e=new ERP();


        e.add(new Manager(1,"Rahul",50000));

        e.add(new Developer(2,"Aman",45000));

        e.add(new Developer(3,"Riya",55000));


        e.display();

        System.out.println("Highest Paid");

        e.highest();


        System.out.println("Sorted");

        e.sort();

        e.display();


        System.out.println("Search");

        e.search(2);

    }
}
