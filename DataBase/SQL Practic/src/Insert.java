import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Insert {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(
                "E:\\Programming\\Java\\Java_Assignments\\DataBase\\SQL Practic\\src\\config.properties")) {
            properties.load(input);
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement()) {

            String strSelect = "select name, rollNumber, Section from information";

            String insert = "insert into information values(7,'Muhammad Hashir','BCS07223001','A')";
            stmt.executeUpdate(insert);
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                String name = rset.getString("name");
                String rollNumber = rset.getString("rollNumber");
                String Section = rset.getString("Section");
                System.out.println(name + ", " + rollNumber + ", " + Section);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
