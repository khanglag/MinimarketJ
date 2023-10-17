package DAO;

import ConnectDB.ConnectDB;
import DTO.NhanVien_DTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;

public class NhanVienDAO {
    public ArrayList<NhanVien_DTO> ReadNhanviens() {
        ConnectDB connectDB = new ConnectDB();
        ArrayList<NhanVien_DTO> nvArrayList = new ArrayList<>();
        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI = 1";
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    NhanVien_DTO nhanvien = new NhanVien_DTO(
                    rset.getString("MANV"),
                    rset.getNString("TENNV"),
                    rset.getDate("NGAYSINH").toLocalDate(),
                    rset.getNString("GIOITINH"),
                    rset.getString("CCCD"),
                    rset.getString("SDT"),
                    rset.getString("EMAIL"),
                    rset.getNString("DIACHI"),
                    rset.getString("MAQUYEN"),
                    rset.getBoolean("TONTAI"));                           
                    nvArrayList.add(nhanvien);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn Nhân viên");
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return nvArrayList;
    }

    public boolean add(NhanVien_DTO nv) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(
                "INSERT INTO `nhanvien`(`MANV`, `TENNV`, `NGAYSINH`, `GIOITINH`, `CCCD`, `SDT`, `EMAIL`, `DIACHI`, `MAQUYEN`, `TONTAI`) VALUES "
                        + "('" + nv.getMaNV() 
                        + "','" + nv.getTenNV()
                        + "','" + Date.valueOf(nv.getNgaySinh())
                        + "','" + nv.getGioiTinh()
                        + "','" + nv.getCccd()
                        + "','" + nv.getSdt() 
                        + "','" + nv.getEmail() 
                        + "','" + nv.getDiaChi() 
                        + "','" + nv.getMaQuyen()
                        + "','1')"
        );
        connectDB.closeConnect();
        return success;
    }
    

    public boolean delete(NhanVien_DTO nhanVien) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANV ='" + nhanVien.getMaNV() + "'");
        connectDB.closeConnect();
        return success;
    }


    public boolean update(NhanVien_DTO nhanVien) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `nhanvien` SET "
                        + "`TENNV`='" + nhanVien.getTenNV() 
                        + "',`NGAYSINH`='" + Date.valueOf(nhanVien.getNgaySinh())
                        + "',`SDT`='" + nhanVien.getSdt()
                        + "',`EMAIL`='" + nhanVien.getEmail()
                        + "',`DIACHI`='" + nhanVien.getDiaChi()
                        + "' WHERE `MANV`='" + nhanVien.getMaNV() + "'");
        connectDB.closeConnect();
        return success;
    }

    public NhanVien_DTO search(String maNV) {
        NhanVien_DTO nhanvien = null;
        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI= 1 AND `MANV`='" + maNV + "'";
        ConnectDB connectDB = new ConnectDB();
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    nhanvien = new NhanVien_DTO(
                    rset.getString("MANV"),
                    rset.getNString("TENNV"),
                    rset.getDate("NGAYSINH").toLocalDate(),
                    rset.getNString("GIOITINH"),
                    rset.getString("CCCD"),
                    rset.getString("SDT"),
                    rset.getString("EMAIL"),
                    rset.getNString("DIACHI"),
                    rset.getString("MAQUYEN"),
                    rset.getBoolean("TONTAI"));   
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanvien;
    }
}