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
    public ArrayList<HangHoa_DTO> search(String tenSP, String maNH, double giaBan, String xuatXu) {
    ConnectDB connectDB = new ConnectDB();
    ArrayList<HangHoa_DTO> searchResults = new ArrayList<>();
    String qry = "SELECT * FROM `hanghoa` WHERE TONTAI = 1";

    if (!tenSP.isEmpty()) {
        qry += " AND `TENSP` LIKE '%" + tenSP + "%'";
    }

    if (!maNH.isEmpty()) {
        qry += " AND `MANH` = '" + maNH + "'";
    }

    if (giaBan > 0) {
        qry += " AND `GIABAN` = " + giaBan;
    }

    if (!xuatXu.isEmpty()) {
        qry += " AND `XUATXU` LIKE '%" + xuatXu + "%'";
    }

    ResultSet rSet = connectDB.sqlQuery(qry);

    try {
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
                searchResults.add(hanghoa);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    connectDB.closeConnect();
    return searchResults;
}
}