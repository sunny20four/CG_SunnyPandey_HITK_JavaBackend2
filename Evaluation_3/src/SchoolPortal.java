import java.util.*;

class Student {

    String name;
    int marks[];

    Student(String name){

        this.name=name;
        marks=new int[3];

    }


    double percentage(){

        int sum=0;

        for(int x:marks)
            sum+=x;

        return sum/3.0;

    }


    String grade(){

        double p=percentage();

        if(p>=90)
            return "A";

        else if(p>=75)
            return "B";

        else if(p>=60)
            return "C";

        return "D";
    }


    void display(){

        System.out.println(name);
        System.out.println(percentage());
        System.out.println(grade());

    }

}


class ScienceStudent extends Student {

    ScienceStudent(String n){
        super(n);
    }

    void subjects(){

        System.out.println("Physics Chemistry Maths");

    }

}


class CommerceStudent extends Student {

    CommerceStudent(String n){
        super(n);
    }

    void subjects(){

        System.out.println("Accounts Business Economics");

    }

}


class ArtsStudent extends Student {

    ArtsStudent(String n){
        super(n);
    }

    void subjects(){

        System.out.println("History Geography English");

    }

}


public class SchoolPortal {

    public static void main(String args[]){

        Student s[]=new Student[3];

        s[0]=new ScienceStudent("Raj");
        s[1]=new CommerceStudent("Aman");
        s[2]=new ArtsStudent("Riya");


        Scanner sc=new Scanner(System.in);


        for(Student x:s){

            for(int i=0;i<3;i++){

                x.marks[i]=sc.nextInt();

            }

            x.display();

            if(x instanceof ScienceStudent)
                ((ScienceStudent)x).subjects();

            if(x instanceof CommerceStudent)
                ((CommerceStudent)x).subjects();

            if(x instanceof ArtsStudent)
                ((ArtsStudent)x).subjects();

        }

    }
}