public class DataService {
    public static void main(String[] args) {
        try (DatabaseConnection db = new DatabaseConnection("mysql://localhost/shop")) {
            db.executeQuery("SELECT * FROM orders WHERE status='PENDING'");
            db.executeQuery("UPDATE orders SET status='PROCESSING' WHERE id=101");
        }
        System.out.println("Done - connection safely closed.");
    }
}
