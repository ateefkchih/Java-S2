import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
  private static final String URL = "jdbc:mysql://localhost:3306/biblio";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "";

  public static Connection getConnection() throws SQLException {
    try {
      Class.forName(DRIVER_NAME);
    } catch (ClassNotFoundException e) {
      // Handle ClassNotFoundException (e.g., throw a new exception)
    }
    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
  }
}
