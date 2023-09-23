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
              + "('"+nv.getMa_nv()+"','"+nv.getTen_nv()+"','"+Date.valueOf(convert(nv.getNgay_sinh()))
              +"','"+nv.getGioi_tinh()+"','"+nv.getCCCD()+"','"+nv.getSDT()+"','"+nv.getEmail()+"','"+nv.getDia_chi()+"','"+nv.getMa_quyen()+"','"+Date.valueOf(convert(nv.getNgay_lam()))+"','"+Date.valueOf(nv.getNgay_nghi())
                        +"','"+nv.getHs_luong()+"','"+nv.isTontai()+"')"
        );
        connectDB.closeConnect();
        return succsec;
    }
    
}