package DAO;

import java.util.ArrayList;

import DTO.NhanVien_DTO;

public class test {
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();

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
        String tenNVToSearch = "Khang";
        ArrayList<NhanVien_DTO> resultTenNV = nhanVienDAO.searchNhanVien("A140403", tenNVToSearch, null);
        if (!resultTenNV.isEmpty()) {
            System.out.println("\nKết quả tìm kiếm theo tên nhân viên:");
            for (NhanVien_DTO nhanVien : resultTenNV) {
                System.out.println(nhanVien);
            }
        } else {
            System.out.println("Không tìm thấy nhân viên với tên " + tenNVToSearch);
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
