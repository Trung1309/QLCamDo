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
}
