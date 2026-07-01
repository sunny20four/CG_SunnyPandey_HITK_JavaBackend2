class Restaurant {
    void deliveryTime() {
        System.out.println("Delivery in 30 minutes");
    }
}

class VegRestaurant extends Restaurant {
    @Override
    void deliveryTime() {
        System.out.println("Veg Delivery in 20 minutes");
    }
}

class NonVegRestaurant extends Restaurant {
    @Override
    void deliveryTime() {
        System.out.println("Non-Veg Delivery in 40 minutes");
    }
}

public class p8 {
    public static void main(String[] args) {
        Restaurant r1 = new VegRestaurant();
        Restaurant r2 = new NonVegRestaurant();

        r1.deliveryTime();
        r2.deliveryTime();
    }
}