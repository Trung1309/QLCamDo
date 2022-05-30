/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuyd
 */
public class KhachHangDao {
    public List<KhachHang> getAllUsers() throws ClassNotFoundException, SQLException {
        List<KhachHang> ltl = new ArrayList<KhachHang>();

        Connection connection = DatabaseHelper.getConnection();
        String sql = "select * from KhachHang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KhachHang tl = new KhachHang();
                tl.setMaKH(rs.getString("maKH"));
                tl.setTenKH(rs.getString("tenKH"));
                tl.setDiaChi(rs.getString("diaChi"));
                tl.setSDT(rs.getInt("SDT"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public List<String> getAllId() throws ClassNotFoundException, SQLException {
        List<String> ltl = new ArrayList<String>();

        Connection connection = DatabaseHelper.getConnection();
        String sql = "select * from KhachHang";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ltl.add(rs.getString("maKH"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public ArrayList<KhachHang> findTaiLieu(String id) throws ClassNotFoundException, SQLException{
        ArrayList<KhachHang> ql = new ArrayList<KhachHang>();
        Connection connection = DatabaseHelper.getConnection();
        String sql = "select * from KhachHang where maKH like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                KhachHang tl = new KhachHang();
                tl.setMaKH(rs.getString("maKH"));
                tl.setTenKH(rs.getString("tenKH"));
                tl.setDiaChi(rs.getString("diaChi"));
                tl.setSDT(rs.getInt("SDT"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
     public void add(KhachHang tl) throws ClassNotFoundException, SQLException{
     Connection connection = DatabaseHelper.getConnection();          
            String sql = "INSERT INTO KhachHang (maKH, tenKH, diaChi, SDT) "
                    + "values (?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getMaKH());
                preparedStatement.setString(2, tl.getTenKH());
                preparedStatement.setString(3, tl.getDiaChi());
                preparedStatement.setInt(4, tl.getSDT());
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public void delete(String id) throws ClassNotFoundException, SQLException{
       Connection connection = DatabaseHelper.getConnection();
        String sql = "delete from KhachHang where maKH = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);           
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public void updateUser(KhachHang tl) throws ClassNotFoundException, SQLException{
        Connection connection = DatabaseHelper.getConnection();
        String sql = "Update KhachHang set tenKH = '?' , diaChi = '?' , SDT ? where maKH = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(4, tl.getMaKH());
            preparedStatement.setString(1, tl.getTenKH());
            preparedStatement.setString(2, tl.getDiaChi());
            preparedStatement.setInt(3, tl.getSDT());
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public KhachHang find1TaiLieu(String id) throws ClassNotFoundException, SQLException{
         KhachHang ql = new KhachHang();
        Connection connection = DatabaseHelper.getConnection();
        String sql = "select * from KhachHang where maKH like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ql.setMaKH(rs.getString("maKH"));
                ql.setTenKH(rs.getString("tenKH"));
                ql.setDiaChi(rs.getString("diaChi"));
                ql.setSDT(rs.getInt("SDT"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
}
