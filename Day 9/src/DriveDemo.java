interface Drivable {

    void accelerate(int speed);
    void brake();

    default void startGPS(){
        System.out.println("GPS Started");
    }
}

class Truck implements Drivable {

    public void accelerate(int speed){
        System.out.println("Truck speed "+speed);
    }

    public void brake(){
        System.out.println("Truck brake");
    }
}

class Bicycle implements Drivable {

    public void accelerate(int speed){
        System.out.println("Bicycle speed "+speed);
    }

    public void brake(){
        System.out.println("Bicycle brake");
    }

    public void startGPS(){
        System.out.println("No GPS");
    }
}

public class DriveDemo{

    public static void main(String[] args){

        Drivable d1=new Truck();
        d1.startGPS();

        Drivable d2=new Bicycle();
        d2.startGPS();
    }
}