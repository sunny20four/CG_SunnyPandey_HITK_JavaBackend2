import java.io.*;

class Employee implements Serializable {

    int id;
    String name;
    String department;
    double salary;

    public String toString()
    {
        return id+" "+name+" "+department+" "+salary;
    }
}


public class p27 {

    public static void main(String[] args)
    {

        try(ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("employee.ser")))
        {

            Employee emp =
                    (Employee)in.readObject();

            System.out.println(emp);

        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}