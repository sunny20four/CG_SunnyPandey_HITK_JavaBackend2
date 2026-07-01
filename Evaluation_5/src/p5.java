class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Doctor: " + this.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void display(String name) {
        System.out.println("Parameter Name: " + name);
        System.out.println("Patient Name: " + this.name);
    }
}

public class p5 {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma");
        Patient p = new Patient("Amit");

        d.display();
        p.display("Rohan");
    }
}