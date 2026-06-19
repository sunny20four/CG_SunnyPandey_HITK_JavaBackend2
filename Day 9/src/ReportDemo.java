abstract class ReportGenerator {

    public final void generateReport(){
        printHeader();
        printBody();
        printFooter();
    }

    void printHeader(){
        System.out.println("COMPANY REPORT");
    }

    abstract void printBody();

    void printFooter(){
        System.out.println("END OF REPORT");
    }
}

class SalesReport extends ReportGenerator{

    void printBody(){
        System.out.println("Sales Report");
    }
}

class InventoryReport extends ReportGenerator{

    void printBody(){
        System.out.println("Inventory Report");
    }
}

public class ReportDemo{

    public static void main(String[] args){

        ReportGenerator r1=new SalesReport();
        r1.generateReport();

        ReportGenerator r2=new InventoryReport();
        r2.generateReport();
    }
}