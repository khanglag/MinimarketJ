/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import DTO.HoaDon_DTO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class HoaDonDAO {
    public HoaDonDAO(){
}
    public ArrayList<HoaDon_DTO> ReadHoadons(){
        ArrayList<HoaDon_DTO> ds=new ArrayList<>();
        ConnectDB connectDB=new ConnectDB();
        String qry = "SELECT * FROM `hoadon` WHERE TONTAI = 1";
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if(rset!=null){
                 while(rset.next()){
                     HoaDon_DTO hoaDon =new HoaDon_DTO(rset.getInt("SOHD"), 
                            rset.getString("MANV"),
                            rset.getDate("THOIGIANLAP").toLocalDate(),
                            rset.getNString("MAKH"), 
                            rset.getDouble("TIENKHACHDUA"), 
                            rset.getDouble("TIENTRAKHACH"), 
                            rset.getDouble("CHIETKHAU"), 
                            rset.getDouble("TONGHD"),
                            rset.getBoolean("TONTAI"));
                     ds.add(hoaDon);
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    public boolean add(HoaDon_DTO hd) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(
                "INSERT INTO `hoadon`(`SOHD`, `MANV`, `THOIGIANLAP`, `MAKH`, `TONGHD`, `THANHTOAN`, `TIENKHACHDUA`, `TIENKHACHTRA`, `TONTAI`) VALUES "
                        + "('" +hd.getSoHD()
                        + "','" + hd.getMaNV()
                        + "','" + Date.valueOf(hd.getThoiGianLap())
                        + "','" + hd.getMaKH()
                        + "','" + hd.getTongHD() 
                        + "','" + hd.getThanhToan()
                        + "','" + hd.getTienKhachDua()
                        + "','" + hd.getTienTraKhach()
                        + "','1')"
        );
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(HoaDon_DTO hoaDon) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE HOADON SET TONTAI = 0 WHERE MANV ='" + hoaDon.getSoHD() + "'");
        connectDB.closeConnect();
        return success;
    }


    public boolean update(HoaDon_DTO haoDon) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `hoadon` SET "
                        + "`TONGHD`='" + haoDon.getTongHD() 
                        + "',`THANHTOAN`='" + haoDon.getThanhToan()
                        + "',`TIENKHACHDUA`='" + haoDon.getTienKhachDua()
                        + "',`TIENTRAKHACH`='" + haoDon.getTienTraKhach()
                        + "' WHERE `SOHD`='" + haoDon.getSoHD() + "'");
        connectDB.closeConnect();
        return success;
    }

    public HoaDon_DTO search(int soHD) {
        HoaDon_DTO hoaDon = null;
        String qry = "SELECT * FROM `hoadon` WHERE TONTAI= 1 AND `SOHD`='" + soHD + "'";
        ConnectDB connectDB = new ConnectDB();
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                            hoaDon =new HoaDon_DTO(
                            rset.getInt("SOHD"), 
                            rset.getString("MANV"),
                            rset.getDate("THOIGIANLAP").toLocalDate(),
                            rset.getNString("MAKH"), 
                            rset.getDouble("TIENKHACHDUA"), 
                            rset.getDouble("TIENTRAKHACH"), 
                            rset.getDouble("CHIETKHAU"), 
                            rset.getDouble("TONGHD"),
                            rset.getBoolean("TONTAI")); 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDon;
    }
}


