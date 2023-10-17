package DAO;

import java.util.ArrayList;

import DTO.NhaCungCap_DTO;
import DTO.NhanVien_DTO;

public class test {
    public static void main(String[] args) {
        NhaCungCapDAO nhanVienDAO = new NhaCungCapDAO();

        // // Tìm kiếm theo mã nhân viên
        // String maNVToSearch = "NV001";
        //  ArrayList<NhanVien_DTO> resultMaNV = nhanVienDAO.searchNhanVien(maNVToSearch, null, null);

        // if (resultMaNV != null) {
        //     System.out.println("Kết quả tìm kiếm theo mã nhân viên:");
        //     System.out.println(resultMaNV);
        // } else {
        //     System.out.println("Không tìm thấy nhân viên với mã " + maNVToSearch);
        // }

        // Tìm kiếm theo tên nhân viên
        // String tenNVToSearch = "Khang";
        ArrayList<NhaCungCap_DTO> resultTenNV = nhanVienDAO.search("Nhà cung cấp cho CH",null);
        if (!resultTenNV.isEmpty()) {
            System.out.println("\nKết quả tìm kiếm theo tên nhân viên:");
            for (NhaCungCap_DTO nhanVien : resultTenNV) {
                System.out.println(nhanVien);
            }
        } else {
            System.out.println("Không tìm thấy nhân viên với tên " );
        }

//         // Tìm kiếm theo mã quyền
//         String maQuyenToSearch = "NVBH203";
//         ArrayList<NhanVien_DTO> resultMaQuyen = nhanVienDAO.searchNhanVien(null, null, maQuyenToSearch);
//         if (!resultMaQuyen.isEmpty()) {
//             System.out.println("\nKết quả tìm kiếm theo mã quyền:");
//             for (NhanVien_DTO nhanVien : resultMaQuyen) {
//                 System.out.println(nhanVien);
//             }
//         } else {
//             System.out.println("Không tìm thấy nhân viên với mã quyền " + maQuyenToSearch);
//         }
    }
    
    }
