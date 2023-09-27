/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import DTO.Hoadon;
import Handle.Timeconvert;
import static Handle.Timeconvert.convert;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class HoadonDAO {
    public HoadonDAO(){
}
    public ArrayList<Hoadon> ReadHoadons(){
        ArrayList<Hoadon> ds=new ArrayList<>();
        ConnectDB connectDB=new ConnectDB();
        String qry = "SELECT * FROM `hoadon` WHERE TONTAI = 1";
        ResultSet rset = connectDB.sqlQuery(qry);
        try {
            if(rset!=null){
                 while(rset.next()){
                     Hoadon hd=new Hoadon(rset.getInt("SOHD"), 
                             rset.getNString("MANV")
                             , convert(rset.getDate("THOIGIANLAP").toLocalDate()),
                             rset.getNString("MAKH"), 
                             rset.getDouble("TIENKHACHDUA"), 
                             rset.getDouble("TIENTRAKHACH"), 
                             rset.getDouble("CHIETKHAU"), 
                             rset.getDouble("TONGHD"),
                             rset.getBoolean("TONTAI"));
                     ds.add(hd);
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
}
//ArrayList<Nhanvien> nvArrayList= new ArrayList<>();
//    public NhanvienDao(){
//    }
////    Hàm đọc danh sách dứoi database và đưa ra danh sách dưới dạng arraylist
//    public ArrayList<Nhanvien> ReadNhanviens(){
//        ConnectDB connectDB;
//        connectDB=new ConnectDB();
//        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI = 1";
//            ResultSet rset = connectDB.sqlQuery(qry);
//            try {
//            if(rset!=null){
//                while(rset.next()){
//                    Nhanvien nv =new Nhanvien(rset.getNString("MANV")
//                            ,rset.getNString("TENNV"), convert(rset.getDate("NGAYSINH").toLocalDate())
//                            ,rset.getNString("GIOITINH"), rset.getNString("CCCD"),
//                            rset.getNString("SDT"),rset.getNString("DIACHI"), rset.getNString("MAQUYEN"),
//                            convert(rset.getDate("NGAYBATDAU").toLocalDate()),
//                            convert(rset.getDate("NGAYNGHIVIEC").toLocalDate()), rset.getNString("EMAIL"), 
//                            rset.getInt("HESOLUONG"), 
//                            rset.getBoolean("TONTAI"));
//                    nvArrayList.add(nv);
//                    
//                }
//            }
//        } catch (Exception e) {
//                System.out.println("Lỗi truy vấn Nhân viên");
//                e.printStackTrace();
//        }
//            connectDB.closeConnect();
//            return nvArrayList;
//    }
////    Hàm thêm nhân viên vào danh sách, trả ra true flase theo kết quả của việc thêm nhân viên
//    public boolean add(Nhanvien nv){
//        boolean succsec=false;
//        ConnectDB connectDB;
//        connectDB=new ConnectDB();
//        succsec=connectDB.sqlUpdate(
//                "INSERT INTO `nhanvien`(`MANV`, `TENNV`, `NGAYSINH`, `GIOITINH`, `CCCD`, `SDT`, `EMAIL`, `DIACHI`, `MAQUYEN`, `NGAYBATDAU`, `NGAYNGHIVIEC`, `HESOLUONG`, `TONTAI`) VALUES "
//              + "('"+nv.getMa_nv()
//              +"','"+nv.getTen_nv()
//              +"','"+Date.valueOf(convert(nv.getNgay_sinh()))
//              +"','"+nv.getGioi_tinh()
//              +"','"+nv.getCCCD()+"','"
//              +nv.getSDT()+"','"
//              +nv.getEmail()+"','"+nv.getDia_chi()+"','"
//              +nv.getMa_quyen()
//              +"','"+Date.valueOf(convert(nv.getNgay_lam()))
//              +"','"+Date.valueOf(convert(nv.getNgay_nghi()))
//              +"','"+nv.getHs_luong()+"','"+nv.isTontai()+"')"
//        );
//        connectDB.closeConnect();
//        return succsec;
//    }
////    Hàm xoá nhân viên khỏi danh sách, trả ra kiểm dữ liệu true flase theo kết quả của việc xoá nhân viên
//    public boolean delete(Nhanvien nhanVien) {
//        ConnectDB connectDB;
//        connectDB=new ConnectDB();
//        boolean success = connectDB
//                .sqlUpdate("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANV ='" + nhanVien.getMa_nv() + "'");
//        System.out.println("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANHANVIEN ='" + nhanVien.getMa_nv() + "'");
//        connectDB.closeConnect();
//        return success;
//    }
////    Hàm sửa thông tin nhân viên, trả true false theo việc sửa nhân viên
//    public boolean update(Nhanvien nhanVien) {
//        ConnectDB connectDB;
//        connectDB=new ConnectDB();
//        boolean success = connectDB
//                .sqlUpdate("UPDATE `nhanvien` SET "
//                 +"`TENNV`='"+nhanVien.getTen_nv()+"',`NGAYSINH`='"+Date.valueOf(convert(nhanVien.getNgay_sinh()))+
//                  "',`GIOITINH`='"+nhanVien.getGioi_tinh()
//                 +"',`CCCD`='"+nhanVien.getCCCD()
//                 +"',`SDT`='"+nhanVien.getSDT()
//                 +"',`EMAIL`='"+nhanVien.getEmail()
//                 +"',`DIACHI`='"+nhanVien.getDia_chi()
//                 +"',`MAQUYEN`='"+nhanVien.getMa_quyen()
//                 +"',`NGAYBATDAU`='"+Date.valueOf(convert(nhanVien.getNgay_lam()))
//                 +"',`NGAYNGHIVIEC`='"+Date.valueOf(convert(nhanVien.getNgay_nghi()))
//                 +"',`HESOLUONG`='"+nhanVien.getHs_luong()
//                 +"',`TONTAI`='"+nhanVien.isTontai()+"' WHERE `MANV`='"+nhanVien.getMa_nv()+"'");
//        System.out.println("UPDATE `nhanvien` SET "
//                 +"`TENNV`='"+nhanVien.getTen_nv()+"',`NGAYSINH`='"+Date.valueOf(convert(nhanVien.getNgay_sinh()))+
//                  "',`GIOITINH`='"+nhanVien.getGioi_tinh()
//                 +"',`CCCD`='"+nhanVien.getCCCD()
//                 +"',`SDT`='"+nhanVien.getSDT()
//                 +"',`EMAIL`='"+nhanVien.getEmail()
//                 +"',`DIACHI`='"+nhanVien.getDia_chi()
//                 +"',`MAQUYEN`='"+nhanVien.getMa_quyen()
//                 +"',`NGAYBATDAU`='"+Date.valueOf(convert(nhanVien.getNgay_lam()))
//                 +"',`NGAYNGHIVIEC`='"+Date.valueOf(convert(nhanVien.getNgay_nghi()))
//                 +"',`HESOLUONG`='"+nhanVien.getHs_luong()
//                 +"',`TONTAI`='"+nhanVien.isTontai()+"' WHERE `MANV`='"+nhanVien.getMa_nv()+"'");
//        connectDB.closeConnect();
//        return success;
//    }
////    Hàm tìm kiếm nhân viên theo mã nhân viên, trả ra nhân viên
//    public Nhanvien search(String Ma_nv){
//       Nhanvien nhanvien=null;
//        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI= 1 AND `MANV`='" + Ma_nv +"'";
//        ConnectDB connectDB= new ConnectDB();
//        ResultSet rset = connectDB.sqlQuery(qry);
//       try {
//            if (rset != null) {
//                while (rset.next()) {
//                     nhanvien =new Nhanvien(rset.getNString("MANV")
//                            ,rset.getNString("TENNV"), convert(rset.getDate("NGAYSINH").toLocalDate())
//                            ,rset.getNString("GIOITINH"), rset.getNString("CCCD"),
//                            rset.getNString("SDT"),rset.getNString("DIACHI"), rset.getNString("MAQUYEN"),
//                            convert(rset.getDate("NGAYBATDAU").toLocalDate()),
//                            convert(rset.getDate("NGAYNGHIVIEC").toLocalDate()), rset.getNString("EMAIL"), 
//                            rset.getInt("HESOLUONG"), 
//                            rset.getBoolean("TONTAI"));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return nhanvien;
//    }