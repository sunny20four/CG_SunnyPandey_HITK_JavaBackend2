abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }

    abstract void startEngine();
}

class Car extends Vehicle {

    int doors;

    public Car(String brand,int year,int doors){
        super(brand,year);
        this.doors=doors;
    }

    void startEngine(){
        System.out.println(brand+" car engine started");
    }
}

public class VehicleDemo {
    public static void main(String[] args){
        Vehicle v=new Car("BMW",2025,4);
        v.startEngine();
    }
}
