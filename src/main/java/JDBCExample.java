import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public JDBCExample() {
    }

    public static void main(String[] args)
    {
        Connection connection = null;

        try
        {
            // the postgresql driver string
            Class.forName("org.postgresql.Driver").newInstance();

            // the postgresql url
            String url = "jdbc:postgresql://localhost/postgres";

            // get the postgresql database connection
            connection = DriverManager.getConnection(url,"postgres", "postgres");

            // now do whatever you want to do with the connection
            // ...

        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.exit(2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
