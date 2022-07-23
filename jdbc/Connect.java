import java.sql.*;

public class Connect {
    private static Connection con;

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
    }

    public static void main(String[] args) {
        // Connection con = null;
        // Statement stmt = null;
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
        try {
            // Connection con;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("Query failed");

        }
    }

}
