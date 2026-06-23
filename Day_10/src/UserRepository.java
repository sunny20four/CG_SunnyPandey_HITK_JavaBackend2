public class UserRepository {
    public static Object findById(int id) throws DatabaseException {
        try {
            throw new java.sql.SQLException("Connection timed out");
        } catch (java.sql.SQLException e) {
            throw new DatabaseException("Failed to fetch user with id=" + id, e);
        }
    }
}
