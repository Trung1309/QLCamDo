/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NguoiDungDao {
    public boolean insertTK(NguoiDung n) throws SQLException, Exception{
        String sql = "insert into NguoiDung(tenDN,SDT,matKhau)"
                + "values(?,?,?)";
        
        Connection conn = DatabaseHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,n.getUser());
        ps.setString(2, n.getSdt());
        ps.setString(3,n.getPass());
        
        return ps.executeUpdate() > 0;
    }
}
