import java.sql.*;

public class Practic {

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop", "aliyan", "Ichbin10$");
                Statement stmt = con.createStatement();) {
            String insert = "insert into information values('7','Muhammmad Ali','BCS07332123','A')";
            stmt.executeUpdate(insert);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}