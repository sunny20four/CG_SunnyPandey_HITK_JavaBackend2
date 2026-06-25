import java.util.*;

class ParkingSlot {

    String type;
    boolean occupied;
    int number;

    ParkingSlot(String type,int number){

        this.type=type;
        this.number=number;
        occupied=false;

    }

}


class Parking {

    ArrayList<ParkingSlot> slots=new ArrayList<>();

    Parking(){

        slots.add(new ParkingSlot("Bike",1));
        slots.add(new ParkingSlot("Bike",2));
        slots.add(new ParkingSlot("Car",3));
        slots.add(new ParkingSlot("Car",4));
        slots.add(new ParkingSlot("Truck",5));

    }


    void allocate(String type){

        for(ParkingSlot s:slots){

            if(s.type.equals(type)&&!s.occupied){

                s.occupied=true;

                System.out.println("Slot Allocated: "+s.number);
                return;

            }

        }

        System.out.println("No Slot Available");

    }


    void release(int no){

        for(ParkingSlot s:slots){

            if(s.number==no){

                s.occupied=false;

                System.out.println("Slot Released");

                return;

            }

        }

    }


    void show(){

        for(ParkingSlot s:slots){

            System.out.println(
                    s.number+" "+s.type+" "+(s.occupied?"Full":"Empty"));

        }

    }


    void bill(int hours){

        int charge=hours*50;

        System.out.println("Parking Charge: "+charge);

    }

}


public class SmartParking {

    public static void main(String args[]){

        Parking p=new Parking();

        p.allocate("Car");
        p.allocate("Bike");

        p.show();

        p.bill(5);

        p.release(3);

        p.show();

    }
}