package Until;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class XJDBC {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLHOCVIEN;encrypt=false";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("Kết nối thành công!");
            
            conn.close();
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại: " + e.getMessage());
        }
    }
}
