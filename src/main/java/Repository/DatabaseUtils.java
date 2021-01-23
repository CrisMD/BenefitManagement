package Repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtils {

    private static Connection con;

    public static Connection getConnection () {

        if (con != null) {

            return con;

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/benefit_management", "root", "w3n33dd4tab!");

                return con;

            } catch (Exception e) {
                System.out.println(e);
                return null;
            }

        }
    }

}
