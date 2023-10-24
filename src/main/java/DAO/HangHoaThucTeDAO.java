package DAO;

import DTO.HangHoaThucTe_DTO;
import DTO.HangHoa_DTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import ConnectDB.ConnectDB;



public class HangHoaThucTeDAO {
    public HangHoaThucTeDAO() {
    }

    public ArrayList<HangHoaThucTe_DTO> ReadHangHoaThucTe() {
        ConnectDB connectDB = new ConnectDB();
        ArrayList<HangHoaThucTe_DTO> hhttArrayList = new ArrayList<>();
        String qry = "SELECT * FROM hanghoathucte WHERE TONTAI = 1";
        ResultSet rSet = null;

        try {
            rSet = connectDB.sqlQuery(qry);
            if (rSet != null) {
                while (rSet.next()) {
                    HangHoaThucTe_DTO hanghoatt = new HangHoaThucTe_DTO(
                            rSet.getString("MASP"),
                            rSet.getNString("TENSP"),
                            rSet.getNString("DONVI"),
                            rSet.getInt("SOLUONGTHUCTE"),
                            rSet.getDate("NGAYKIEM").toLocalDate(),
                            rSet.getBoolean("TONTAI"));
                    hhttArrayList.add(hanghoatt);
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn hàng hóa");
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return hhttArrayList;
    }

    public boolean add(HangHoaThucTe_DTO ht) {
        boolean success = false;
        ConnectDB connectDB = new ConnectDB();
        success = connectDB.sqlUpdate(
                "INSERT INTO `hanghoathucte`(`MASP`, `TENSP`, `DONVI`, `SOLUONGTHUCTE`, `NGAYKIEM`,'TONTAI') VALUES "
                        + "('" + ht.getMaSP()
                        + "','" + ht.getTenSP()
                        + "','" + ht.getDonVi()
                        + "','" + ht.getSoLuongThucTe()
                        + "','" + Date.valueOf(ht.getNgayKiem())  
                        + "','1')");
        connectDB.closeConnect();
        return success;
    }

    public boolean delete(HangHoaThucTe_DTO hhtt) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE HANGHOATHUCTE SET TONTAI = 0 WHERE MASP ='" + hhtt.getMaSP() + "'");
        connectDB.closeConnect();
        return success;
    }

    public boolean update(HangHoaThucTe_DTO hangHoa) {
        ConnectDB connectDB = new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `hanghoa` SET "
                        + "`TENSP`='" + hangHoa.getTenSP()
                        + "','DONVI ='" + hangHoa.getDonVi()
                        + "',`SOLUONGTHUCTE`='" + hangHoa.getSoLuongThucTe()
                        + "' WHERE `MASP`='" + hangHoa.getMaSP() + "'");
        connectDB.closeConnect();
        return success;
    }

    public ArrayList<HangHoaThucTe_DTO> searchHangHoa(String tenSP, int soLuongThucTe, LocalDate ngayKiem) {
        ArrayList<HangHoaThucTe_DTO> ds = new ArrayList<>();
        ConnectDB connectDB = new ConnectDB();

        StringBuilder qry = new StringBuilder("SELECT * FROM `hanghoathucte` WHERE TONTAI = 1");

        if (tenSP != null && !tenSP.isEmpty()) {
            qry.append(" AND `TENSP` LIKE '%").append(tenSP).append("%'");
        }
        if (soLuongThucTe > 0) {
            qry.append(" AND `SOLUONGTHUCTE` = ").append(soLuongThucTe);
        }

        if (ngayKiem != null ) {
            qry.append(" AND `NGAYKIEM` = '").append(Date.valueOf(ngayKiem)).append("'");
        }


        ResultSet rSet = connectDB.sqlQuery(qry.toString());

        try {
            if (rSet != null) {
                while (rSet.next()) {
                    HangHoaThucTe_DTO ht = new HangHoaThucTe_DTO(
                            rSet.getString("MASP"),
                            rSet.getNString("TENSP"),
                            rSet.getNString("DONVI"),
                            rSet.getInt("SOLUONGTHUCTE"),
                            rSet.getDate("NGAYKIEM").toLocalDate(),
                            rSet.getBoolean("TONTAI"));

                    ds.add(ht);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ds;
    }
}