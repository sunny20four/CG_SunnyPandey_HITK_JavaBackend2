package Day7;

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Car", 1500),
                new Bike("Bike", 500),
                new Truck("Truck", 3000)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.showRent(3);
        }
    }
}

class Vehicle {
    String name;
    double rentPerDay;

    Vehicle(String name, double rentPerDay) {
        this.name = name;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }

    void showRent(int days) {
        System.out.println(name + " rent: " + calculateRent(days));
    }
}

class Car extends Vehicle {
    Car(String name, double rentPerDay) {
        super(name, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return super.calculateRent(days) + 500;
    }
}

class Bike extends Vehicle {
    Bike(String name, double rentPerDay) {
        super(name, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return super.calculateRent(days);
    }
}

class Truck extends Vehicle {
    Truck(String name, double rentPerDay) {
        super(name, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return super.calculateRent(days) + 1000;
    }
}
