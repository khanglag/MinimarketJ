/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import java.util.ArrayList;
import DTO.ChiTietPhieuNhap_DTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class ChiTietPhieuNhapDAO {
    public ChiTietPhieuNhapDAO() {
    }

    public ArrayList<ChiTietPhieuNhap_DTO> readBD() {
        ConnectDB connectDB = new ConnectDB();
        ArrayList<ChiTietPhieuNhap_DTO> chiTietPhieuNhap_DTOs = new ArrayList<>();
        String qry = "SELECT * FROM `chitiet_phieunhap` WHERE TONTAI = 1";
        ResultSet rSet = null;
        try {
            rSet = connectDB.sqlQuery(qry);
            if (rSet != null) {
                while (rSet.next()) {
                    ChiTietPhieuNhap_DTO tietPhieuNhap_DTO = new ChiTietPhieuNhap_DTO(
                            rSet.getNString("MAPHIEUNHAP"),
                            rSet.getNString("MAHANGNHAP"),
                            rSet.getNString("TENHANGNHAP"),
                            rSet.getDouble("VAT"), rSet.getNString("XUATXU"),
                            rSet.getNString("ANHSP"),
                            rSet.getInt("SOLUONG"),
                            rSet.getNString("DONVI"),
                            rSet.getDouble("GIANHAP"),
                            rSet.getDouble("TONGTIENNHAP"),
                            rSet.getBoolean("TONTAI"));
                    chiTietPhieuNhap_DTOs.add(tietPhieuNhap_DTO);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn phiếu nhập");
            e.printStackTrace();
        }
        return chiTietPhieuNhap_DTOs;
    }

    public boolean add(ChiTietPhieuNhap_DTO ct) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(""
                + "INSERT INTO `chitiet_phieunhap`(`MAPHIEUNHAP`, `MAHANGNHAP`, `TENHANGNHAP`, `VAT`, `XUATXU`, `ANHSP`, `SOLUONG`, `DONVI`, `GIANHAP`, `TONGTIENNHAP`, `TONTAI`) VALUES ("
                + "'" + ct.getMaPhieuNhap() + "',"
                + "'" + ct.getMaHangNhap() + "',"
                + "'" + ct.gettenHangNhap() + "',"
                + "'" + ct.getVAT() + "',"
                + "'" + ct.getXuatXu() + "',"
                + "'" + ct.getAnhSP() + "',"
                + "'" + ct.getSoLuong() + "',"
                + "'" + ct.getDonVi() + "',"
                + "'" + ct.getGiaNhap() + "',"
                + "'" + ct.getTongTienNhap() + "',"
                + "'1')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(ChiTietPhieuNhap_DTO ct) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `chitiet_phieunhap` SET TONTAI = 0 WHERE `MAPHIEUNHAP`=" + ct.getMaPhieuNhap() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean update(ChiTietPhieuNhap_DTO ct) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `chitiet_phieunhap` SET "
                        + "`MAHANGNHAP`='"+ct.getMaHangNhap()+"',"
                        + "`TENHANGNHAP`='"+ct.gettenHangNhap()+"',"
                        + "`VAT`='"+ct.getVAT()+"',"
                        + "`XUATXU`='"+ct.getXuatXu()+"',"
                        + "`ANHSP`='"+ct.getAnhSP()+"',"
                        + "`SOLUONG`='"+ct.getSoLuong()+"',"
                        + "`DONVI`='"+ct.getDonVi()+"',"
                        + "`GIANHAP`='"+ct.getGiaNhap()+"',"
                        + "`TONGTIENNHAP`='"+ct.getTongTienNhap()+"',"
                        + "`TONTAI`='"+ct.isTonTai()+"' "
                        + "WHERE `MAPHIEUNHAP`='"+ct.getMaPhieuNhap()+"'");
        connectDB.closeConnect();
        return success;
    }

    public ArrayList<ChiTietPhieuNhap_DTO> searchHangHoa(String maPhieuNhap, String maHangNhap, 
            String tenHangNhap, double VAT, String xuatXu, String anhSP, int soLuong, String donVi,
            double giaNhap, double tongTienNhap, boolean tonTai) {
        ArrayList<ChiTietPhieuNhap_DTO> ds = new ArrayList<>();
        ConnectDB connectDB = new ConnectDB();

        StringBuilder qry = new StringBuilder("SELECT * FROM `chitiet_phieunhap` WHERE TONTAI = 1");
        if (maPhieuNhap != null && !maPhieuNhap.isEmpty()) {
            qry.append(" AND `MAPHIEUNHAP` = '").append(maPhieuNhap).append("'");
        }
        if (maHangNhap != null && !maHangNhap.isEmpty()) {
            qry.append(" AND `MAHANGNHAP` = '").append(maHangNhap).append("'");
        }
        if (xuatXu != null && !xuatXu.isEmpty()) {
            qry.append(" AND `XUATXU` = '").append(xuatXu).append("'");
        }
        ResultSet rSet = connectDB.sqlQuery(qry.toString());

        try {
            if (rSet != null) {
                while (rSet.next()) {
                    ChiTietPhieuNhap_DTO ct = new ChiTietPhieuNhap_DTO();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ds;
    }
}
