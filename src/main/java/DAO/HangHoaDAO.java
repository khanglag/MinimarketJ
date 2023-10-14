package DAO;

import DTO.HangHoa_DTO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ConnectDB.ConnectDB;
 // Import the HangHoa_DTO class

public class HangHoaDAO {
    public HangHoaDAO() {
    }

    public ArrayList<HangHoa_DTO> ReadHangHoa() {
        ConnectDB connectDB = new ConnectDB();
        ArrayList<HangHoa_DTO> hhArrayList = new ArrayList<>();
        String qry = "SELECT * FROM hanghoa WHERE TONTAI = 1"; 
        ResultSet rSet = null;

        try {
            rSet = connectDB.sqlQuery(qry);
            if (rSet != null) {
                while (rSet.next()) {
                    HangHoa_DTO hanghoa = new HangHoa_DTO(
                            rSet.getString("MASP"),
                            rSet.getNString("TENSP"),
                            rSet.getString("MANH"),
                            rSet.getString("MANCC"),
                            rSet.getNString("DONVI"),
                            rSet.getDouble("GIANHAP"), 
                            rSet.getDouble("GIABAN"),
                            rSet.getInt("SOLUONG"),
                            rSet.getNString("XUATXU"),
                            rSet.getString("ANHSP"), 
                            rSet.getBoolean("TONTAI"));
                    hhArrayList.add(hanghoa);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn hàng hóa");
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return hhArrayList;
    }
    public boolean add(HangHoa_DTO hh) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(
                "INSERT INTO `hanghoa`(`MASP`, `TENSP`, `MANH`, `MANCC`, `DONVI`, `GIANHAP`, `GIABAN`, `SOLUONG`, `XUATXU`, `ANHSP`, 'TONTAI') VALUES "
                        + "('" + hh.getMaSP()
                        + "','" + hh.getTenSP()
                        + "','" + hh.getMaNH()
                        + "','" + hh.getMaNCC()
                        + "','" + hh.getDonVi()
                        + "','" + hh.getGiaNhap()
                        + "','" + hh.getGiaBan()
                        + "','" + hh.getSoLuong()
                        + "','" + hh.getXuatXu()
                        + "','" + hh.getAnhSP()
                        + "','1')"
        );
        connectDB.closeConnect();
        return success;
    }
    public boolean delete(HangHoa_DTO hangHoa) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE HANGHOA SET TONTAI = 0 WHERE MASP ='" + hangHoa.getMaSP() + "'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(HangHoa_DTO hangHoa) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `hanghoa` SET "
                        + "`TENSP`='" + hangHoa.getTenSP()
                        + "','DONVI ='" + hangHoa.getDonVi()
                        + "',`GIANHAP`='" + hangHoa.getGiaNhap()
                        + "',`GIABAN`='" + hangHoa.getGiaBan()
                        + "',`SOLUONG`='" + hangHoa.getSoLuong()
                        + "' WHERE `MASP`='" + hangHoa.getMaSP() + "'");
        connectDB.closeConnect();
        return success;
    }
     public HangHoa_DTO search(String maSP) {
        HangHoa_DTO hangHoa = null;
        String qry = "SELECT * FROM `hanghoa` WHERE TONTAI= 1 AND `MASP`='" + maSP + "'";
        ConnectDB connectDB = new ConnectDB();
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if (rset != null) {
                while (rset.next()) {
                    hangHoa = new HangHoa_DTO(
                    rset.getString("MASP"),
                    rset.getNString("TENSP"),
                    rset.getString("MANH"),
                    rset.getString("MANCC"),
                    rset.getNString("DONVI"),
                    rset.getDouble("GIANHAP"), 
                    rset.getDouble("GIABAN"),
                    rset.getInt("SOLUONG"),
                    rset.getNString("XUATXU"),
                    rset.getString("ANHSP"), 
                    rset.getBoolean("TONTAI")); 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hangHoa;
    }
}
