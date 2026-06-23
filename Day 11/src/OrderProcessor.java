import java.io.*;
import java.sql.*;

public class OrderProcessor {
    public static void processOrder(int orderId) {
        try {
            fetchFromDB(orderId);
            generateInvoice(orderId);
        } catch (SQLException | IOException e) {
            System.out.println("Order processing failed: " + e.getMessage());
            notifyAdmin(orderId, e.getClass().getSimpleName());
        }
    }

    static void fetchFromDB(int id) throws SQLException {}

    static void generateInvoice(int id) throws IOException {}

    static void notifyAdmin(int orderId, String errorType) {
        System.out.println("[ADMIN ALERT] Order " + orderId + " failed: " + errorType);
    }
}
