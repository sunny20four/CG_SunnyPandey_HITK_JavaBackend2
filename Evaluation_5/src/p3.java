class Vehicle {
    double calculateRent(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    double calculateRent(int days) {
        return days * 1000;
    }
}

class Bike extends Vehicle {
    @Override
    double calculateRent(int days) {
        return days * 500;
    }
}

public class p3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Car Rent: " + v1.calculateRent(3));
        System.out.println("Bike Rent: " + v2.calculateRent(3));
    }
}