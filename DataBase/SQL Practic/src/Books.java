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

            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n"); 

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;

            while (rset.next()) {
                String title = rset.getString("title"); 
                double price = rset.getDouble("price"); 
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
