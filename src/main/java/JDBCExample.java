import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public JDBCExample() {
    }

    public static void main(String[] var0) {
        try {
            Connection dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                                                            "postgres", "postgres");
            Throwable var = null;

            try {
                if (dbConnection != null) {
                    System.out.println("Succeeded to connect to the database...");
                } else {
                    System.out.println("Failed to make connection to database...");
                }
            } catch (Throwable var13) {
                var = var13;
                throw var13;
            } finally {
                if (dbConnection != null) {
                    if (var != null) {
                        try {
                            dbConnection.close();
                        } catch (Throwable var12) {
                            var.addSuppressed(var12);
                        }
                    } else {
                        dbConnection.close();
                    }
                }

            }
        } catch (SQLException var15) {
            System.err.format("SQL State: %s\n%s", var15.getSQLState(), var15.getMessage());
        } catch (Exception var16) {
            var16.printStackTrace();
        }

    }
}
