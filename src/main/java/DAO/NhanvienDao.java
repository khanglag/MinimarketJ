/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import DTO.Nhanvien;
import java.sql.ResultSet;
import java.util.ArrayList;
import Handle.Convert;
import static Handle.Convert.stringtobool;
import static Handle.Timeconvert.convert;
import java.sql.Date;

/**
 *
 * @author pc
 */
public class NhanvienDao {
    ArrayList<Nhanvien> nvArrayList= new ArrayList<>();
    public NhanvienDao(){
    }
    public ArrayList<Nhanvien> ReadNhanviens(){
        ConnectDB connectDB;
        connectDB=new ConnectDB();
        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI = 1";
            ResultSet rset = connectDB.sqlQuery(qry);
            try {
            if(rset!=null){
                while(rset.next()){
                    Nhanvien nv =new Nhanvien(rset.getNString("MANV")
                            ,rset.getNString("TENNV"), convert(rset.getDate("NGAYSINH").toLocalDate())
                            ,rset.getNString("GIOITINH"), rset.getNString("CCCD"),
                            rset.getNString("SDT"),rset.getNString("DIACHI"), rset.getNString("MAQUYEN"),
                            convert(rset.getDate("NGAYBATDAU").toLocalDate()),
                            convert(rset.getDate("NGAYNGHIVIEC").toLocalDate()), rset.getNString("EMAIL"), 
                            rset.getInt("HESOLUONG"), 
                            rset.getBoolean("TONTAI"));
                    nvArrayList.add(nv);
                    
                }
            }
        } catch (Exception e) {
                System.out.println("Lỗi truy vấn Nhân viên");
                e.printStackTrace();
        }
            connectDB.closeConnect();
            return nvArrayList;
    }
    public boolean add(Nhanvien nv){
        boolean succsec=false;
        ConnectDB connectDB;
        connectDB=new ConnectDB();
        succsec=connectDB.sqlUpdate(
                "INSERT INTO `nhanvien`(`MANV`, `TENNV`, `NGAYSINH`, `GIOITINH`, `CCCD`, `SDT`, `EMAIL`, `DIACHI`, `MAQUYEN`, `NGAYBATDAU`, `NGAYNGHIVIEC`, `HESOLUONG`, `TONTAI`) VALUES "
              + "('"+nv.getMa_nv()
              +"','"+nv.getTen_nv()
              +"','"+Date.valueOf(convert(nv.getNgay_sinh()))
              +"','"+nv.getGioi_tinh()
              +"','"+nv.getCCCD()+"','"
              +nv.getSDT()+"','"
              +nv.getEmail()+"','"+nv.getDia_chi()+"','"
              +nv.getMa_quyen()
              +"','"+Date.valueOf(convert(nv.getNgay_lam()))
              +"','"+Date.valueOf(convert(nv.getNgay_nghi()))
              +"','"+nv.getHs_luong()+"','"+nv.isTontai()+"')"
        );
        connectDB.closeConnect();
        return succsec;
    }
    public boolean delete(Nhanvien nhanVien) {
        ConnectDB connectDB;
        connectDB=new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANV ='" + nhanVien.getMa_nv() + "'");
        System.out.println("UPDATE NHANVIEN SET TONTAI = 0 WHERE MANHANVIEN ='" + nhanVien.getMa_nv() + "'");
        connectDB.closeConnect();
        return success;
    }
    public boolean update(Nhanvien nhanVien) {
        ConnectDB connectDB;
        connectDB=new ConnectDB();
        boolean success = connectDB
                .sqlUpdate("UPDATE `nhanvien` SET "
                 +"`TENNV`='"+nhanVien.getTen_nv()+"',`NGAYSINH`='"+Date.valueOf(convert(nhanVien.getNgay_sinh()))+
                  "',`GIOITINH`='"+nhanVien.getGioi_tinh()
                 +"',`CCCD`='"+nhanVien.getCCCD()
                 +"',`SDT`='"+nhanVien.getSDT()
                 +"',`EMAIL`='"+nhanVien.getEmail()
                 +"',`DIACHI`='"+nhanVien.getDia_chi()
                 +"',`MAQUYEN`='"+nhanVien.getMa_quyen()
                 +"',`NGAYBATDAU`='"+Date.valueOf(convert(nhanVien.getNgay_lam()))
                 +"',`NGAYNGHIVIEC`='"+Date.valueOf(convert(nhanVien.getNgay_nghi()))
                 +"',`HESOLUONG`='"+nhanVien.getHs_luong()
                 +"',`TONTAI`='"+nhanVien.isTontai()+"' WHERE `MANV`='"+nhanVien.getMa_nv()+"'");
        System.out.println("UPDATE `nhanvien` SET "
                 +"`TENNV`='"+nhanVien.getTen_nv()+"',`NGAYSINH`='"+Date.valueOf(convert(nhanVien.getNgay_sinh()))+
                  "',`GIOITINH`='"+nhanVien.getGioi_tinh()
                 +"',`CCCD`='"+nhanVien.getCCCD()
                 +"',`SDT`='"+nhanVien.getSDT()
                 +"',`EMAIL`='"+nhanVien.getEmail()
                 +"',`DIACHI`='"+nhanVien.getDia_chi()
                 +"',`MAQUYEN`='"+nhanVien.getMa_quyen()
                 +"',`NGAYBATDAU`='"+Date.valueOf(convert(nhanVien.getNgay_lam()))
                 +"',`NGAYNGHIVIEC`='"+Date.valueOf(convert(nhanVien.getNgay_nghi()))
                 +"',`HESOLUONG`='"+nhanVien.getHs_luong()
                 +"',`TONTAI`='"+nhanVien.isTontai()+"' WHERE `MANV`='"+nhanVien.getMa_nv()+"'");
        connectDB.closeConnect();
        return success;
    }
    public ArrayList<Nhanvien> search(String Ma_nv, String Ten_nv, String Ngay_sinh, 
            String Gioi_tinh, String CCCD, String SDT, String Dia_chi,
            String Ma_quyen, String Ngay_lam, String Ngay_nghi, String email, 
            double hs_luong, Boolean Tontai){
        ArrayList<Nhanvien> nhanviens =new ArrayList<>();
        String qry = "SELECT * FROM `nhanvien` WHERE TONTAI= 1";
        if (!Ma_nv.equals("")) 
            qry+=" AND `MANV`= '" + Ma_nv + "'";
        if (!Ten_nv.equals("")) 
            qry+=" AND `TENNV`= '" + Ten_nv+ "'";
        if (!Ten_nv.equals("")) 
            qry+=" AND `TENNV`= '" + Ten_nv+ "'";
        return nhanviens;
    }
}