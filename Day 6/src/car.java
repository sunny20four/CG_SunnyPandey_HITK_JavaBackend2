public class car {
    String brand;
    String color;
    int topSpeed;
    void displayInfo() {
        System.out.println("Brand: "+ brand);
        System.out.println("Color: " + color);
        System.out.println("Top Speed: "+ topSpeed + "km/h");
    }
    public static void main(String[] args)
    {
        car car1=new car();
        car1.brand="Toyota";
        car1.color="Red";
        car1.topSpeed=180;

        car car2=new car();
        car2.brand="Tesla";
        car2.color="White";
        car2.topSpeed=250;

        car1.displayInfo();
        System.out.println("-------------");
        car2.displayInfo();
    }
}
