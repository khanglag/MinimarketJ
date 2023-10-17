package DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import DAO.NhanVienDAO;
import DTO.ChiTietHoaDon_DTO;
import DTO.NhanVien_DTO;

public class test {
    public static void main(String[] args) {
        ChiTietHoaDonDAO cthddto=new ChiTietHoaDonDAO();
        ArrayList<ChiTietHoaDon_DTO> A;
        A=cthddto.readBD();
        for (ChiTietHoaDon_DTO chiTietHoaDon_DTO : A) {
            System.out.println(chiTietHoaDon_DTO.toString());
        }
    }
}
