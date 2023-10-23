package DAO;

import DTO.ChiTietHoaDon_DTO;
import DTO.ChiTietPhieuNhap_DTO;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestHangHoaDAO {
    public static void main(String[] args) {
        ChiTietPhieuNhapDAO ctpndao=new ChiTietPhieuNhapDAO();
        
        for(ChiTietPhieuNhap_DTO tempChiTietHoaDon_DTO:ctpndao.readBD())
        {
            System.out.println(tempChiTietHoaDon_DTO.toString());
        }
    }
}