import java.io.*;
import java.util.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
        return id+" "+name;
    }
}


public class p28 {

    public static void main(String[] args)
    {

        ArrayList<Student> list =
                new ArrayList<>();

        list.add(new Student(1,"Rahul"));
        list.add(new Student(2,"Priya"));


        try(ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("students.ser")))
        {

            out.writeObject(list);

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


        try(ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("students.ser")))
        {

            ArrayList<Student> data =
                    (ArrayList<Student>)in.readObject();

            for(Student s:data)
                System.out.println(s);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}