class Vehicle {
    String name;
    int days;

    Vehicle(String name, int days) {
        this.name = name;
        this.days = days;
    }

    double calculatePrice() {
        return 0;
    }

    void bill() {
        System.out.println("Vehicle: " + name);
        System.out.println("Days: " + days);
        System.out.println("Amount: " + calculatePrice());
    }
}

class Car extends Vehicle {
    Car(String name, int days) {
        super(name, days);
    }

    double calculatePrice() {
        return days * 1500;
    }
}

class Bike extends Vehicle {
    Bike(String name, int days) {
        super(name, days);
    }

    double calculatePrice() {
        return days * 700;
    }
}

class Truck extends Vehicle {
    Truck(String name, int days) {
        super(name, days);
    }

    double calculatePrice() {
        return days * 2500;
    }
}

public class RentalSystem {
    public static void main(String[] args) {

        Vehicle v[] = {
                new Car("BMW",3),
                new Bike("Yamaha",4),
                new Truck("Volvo",2)
        };

        for(Vehicle x:v){
            x.bill();
            System.out.println();
        }
    }
}
