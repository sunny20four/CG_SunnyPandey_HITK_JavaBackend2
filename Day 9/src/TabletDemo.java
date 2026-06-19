interface Chargeable{
    void charge();
}

interface Connectable{
    void connect();
}

interface Printable{
    void print();
}

class SmartTablet implements Chargeable,Connectable,Printable{

    public void charge(){
        System.out.println("Charging");
    }

    public void connect(){
        System.out.println("Connected");
    }

    public void print(){
        System.out.println("Printing");
    }
}

public class TabletDemo{

    public static void main(String[] args){

        SmartTablet s=new SmartTablet();

        s.charge();
        s.connect();
        s.print();
    }
}
