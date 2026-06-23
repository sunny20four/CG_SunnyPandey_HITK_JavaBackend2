public class DatabaseConnection implements AutoCloseable {
    private String connectionString;
    private boolean open = false;

    public DatabaseConnection(String connStr) {
        this.connectionString = connStr;
        this.open = true;
        System.out.println("DB Connected: " + connStr);
    }

    public void executeQuery(String sql) {
        if (!open) throw new IllegalStateException("Connection is closed!");
        System.out.println("Executing: " + sql);
    }

    @Override
    public void close() {
        open = false;
        System.out.println("DB Connection closed: " + connectionString);
    }
}
