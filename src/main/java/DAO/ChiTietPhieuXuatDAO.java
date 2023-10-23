/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import DTO.ChiTietPhieuXuat_DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ChiTietPhieuXuatDAO {
    public ChiTietPhieuXuatDAO(){
    }
    public ArrayList<ChiTietPhieuXuat_DTO> readBD(){
        ConnectDB connectDB = new ConnectDB();
        ArrayList<ChiTietPhieuXuat_DTO> ctpxdtos = new ArrayList<>();
        String qry = "SELECT * FROM `chitiet_hoadon` WHERE TONTAI = 1"; 
        ResultSet rSet = null;
        try {
            rSet = connectDB.sqlQuery(qry);
            if (rSet != null) {
                while (rSet.next()) {
                    ChiTietPhieuXuat_DTO ctpxdto = new ChiTietPhieuXuat_DTO(rSet.getNString("MAPHIEUXUAT"),
                            rSet.getNString("MAHANGXUAT"),
                            rSet.getInt("SOLUONGYEUCAU"), 
                            rSet.getInt("SOLUONGTHUCXUAT"), 
                            rSet.getNString("DONVI"), 
                            rSet.getDouble("DONGIA"), 
                            rSet.getDouble("THANHTIEN"), 
                            true);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn chi tiết phiếu xuất");
            e.printStackTrace();
        }
        return  ctpxdtos;
    }
    
    public boolean add(ChiTietPhieuXuat_DTO ct) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(""
                + "INSERT INTO `chitiet_phieuxuat`(`MAPHIEUXUAT`, `MAHANGXUAT`, `SOLUONGYEUCAU`, `SOLUONGTHUCXUAT`, `DONVI`, `DONGIA`, `THANHTIEN`, `TONTAI`) VALUES ("
                + "'"+ct.getMaPhieuXuat()+"',"
                + "'"+ct.getMaHangXuat()+"',"
                + "'"+ct.getSoLuongYC()+"',"
                + "'"+ct.getSoLuongThucTe()+"',"
                + "'"+ct.getDonVi()+"',"
                + "'"+ct.getDonGia()+"',"
                + "'"+ct.getThanhTien()+"',"
                + "'1')"
        );
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(ChiTietPhieuXuat_DTO ct) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `chitiet_phieuxuat` SET TONTAI = 0 WHERE `MAPHIEUXUAT`=" + ct.getMaPhieuXuat() + "'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(ChiTietPhieuXuat_DTO ct) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `chitiet_phieuxuat` SET "
                        + "`MAHANGXUAT`='"+ct.getMaHangXuat()+"',"
                        + "`SOLUONGYEUCAU`='"+ct.getSoLuongYC()+"',"
                        + "`SOLUONGTHUCXUAT`='"+ct.getSoLuongThucTe()+"',"
                        + "`DONVI`='"+ct.getDonVi()+"',"
                        + "`DONGIA`='"+ct.getDonGia()+"',"
                        + "`THANHTIEN`='"+ct.getThanhTien()+"',"
                        + "`TONTAI`='1' "
                        + "WHERE `MAPHIEUXUAT`=" + ct.getMaPhieuXuat() + "");
        connectDB.closeConnect();
        return success;
    }
//    Chưa xong mà làm biến quã
//    public ArrayList<ChiTietPhieuXuat_DTO> searchHangHoa(int soHD, String maSP, int soLuong, boolean tonTai) {
//        ArrayList<ChiTietPhieuXuat_DTO> ds = new ArrayList<>();
//        ConnectDB connectDB = new ConnectDB();
//
//        StringBuilder qry = new StringBuilder("SELECT * FROM `chitiet_hoadon` WHERE TONTAI = 1");
//
//        if (soHD >=0) {
//            qry.append(" AND `SOHD` LIKE '%").append(soHD).append("%'");
//        }
//
//        if (maSP != null && !maSP.isEmpty()) {
//            qry.append(" AND `MASP` = '").append(maSP).append("'");
//        }
//
//        if (soLuong > 0) {
//            qry.append(" AND `SOLUONG` = ").append(soLuong);
//        }
//
//        ResultSet rSet = connectDB.sqlQuery(qry.toString());
//
//        try {
//            if (rSet != null) {
//                while (rSet.next()) {
//                    ChiTietPhieuXuat_DTO cthddto = new ChiTietPhieuXuat_DTO();
//                    ds.add(cthddto);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return ds;
//    }
}
