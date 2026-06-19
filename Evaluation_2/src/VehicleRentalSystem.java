class Vehicle {
    double calculateRent(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 1000;
    }
}

class Bike extends Vehicle {
    double calculateRent(int days) {
        return days * 500;
    }
}

class Truck extends Vehicle {
    double calculateRent(int days) {
        return days * 2000;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Truck();

        int days = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Rental Charge: " + v.calculateRent(days));
        }
    }
}