import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Books {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(
                "E:\\Programming\\Java\\Java_Assignments\\DataBase\\SQL Practic\\src\\config.properties")) {
            properties.load(input);
        }

        String url = properties.getProperty("db.url1");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement()) {

            String strUpdate = "update books set price = 44.44, qty = 44 where id = 1005";
            stmt.executeUpdate(strUpdate);
            String strSelect = "select title, price, qty from books";
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
