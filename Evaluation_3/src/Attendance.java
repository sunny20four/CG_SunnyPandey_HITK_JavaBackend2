import java.util.*;

class Employee {

    String name;
    int id;
    int attendance[];

    Employee(String name,int id){
        this.name=name;
        this.id=id;
        attendance=new int[30];
    }

    void addAttendance(){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<30;i++){

            System.out.print("Day "+(i+1)+" (1 Present 0 Absent): ");
            attendance[i]=sc.nextInt();
        }
    }


    int present(){

        int count=0;

        for(int x:attendance){

            if(x==1)
                count++;
        }

        return count;
    }


    int absent(){

        return 30-present();

    }


    double percentage(){

        return (present()*100)/30.0;

    }


    double salary(){

        double basic=30000;

        return basic-(absent()*500);

    }


    void display(){

        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Present: "+present());
        System.out.println("Absent: "+absent());
        System.out.println("Attendance: "+percentage()+"%");
        System.out.println("Salary: "+salary());

    }

}


public class Attendance {

    public static void main(String args[]){

        Employee e=new Employee("Rahul",101);

        e.addAttendance();

        e.display();

    }
}
