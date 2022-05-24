/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class DatabaseHelper {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        String url = "jdbc:jtds:sqlserver://LAPTOP-QDS4JLPE:1433/QuanLiCamDo;instance=SQLEXPRESS";
        String user = "sa";
        String pass = "sa123";
        Connection conn ;
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,pass);
        System.out.println(conn.getCatalog());
        return conn;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getConnection();
    }
}
