package DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import DAO.NhanVienDAO;
import DTO.NhanVien_DTO;

public class test {
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAO(); // Tạo một đối tượng HangHoaDAO
        
        // Gọi hàm ReadHangHoa để lấy danh sách hàng hóa từ cơ sở dữ liệu
        ArrayList<NhanVien_DTO> nvList = nhanVienDAO.ReadNhanviens();
        
    // // Thêm nhân viên
        NhanVien_DTO newNhanVien = new NhanVien_DTO();
        newNhanVien.setMaNV("NV002");
        newNhanVien.setTenNV("Nguyen Van A");
        newNhanVien.setNgaySinh(LocalDate.of(1990, 5, 15));
        newNhanVien.setGioiTinh("Nam");
        newNhanVien.setCccd("123456789");
        newNhanVien.setSdt("0987654321");
        newNhanVien.setEmail("nva@example.com");
        newNhanVien.setDiaChi("123 Street, City");
        newNhanVien.setMaQuyen("NVBH203");
        newNhanVien.setTonTai(true);

        boolean addSuccess = nhanVienDAO.add(newNhanVien);
        if (addSuccess) {
            System.out.println("Thêm nhân viên thành công.");
        } else {
            System.out.println("Lỗi khi thêm nhân viên.");
        }

        // // Đọc danh sách nhân viên
        // System.out.println("Danh sách nhân viên:");
        // ArrayList<NhanVien_DTO> nhanVienList = nhanVienDAO.ReadNhanviens();
        // for (NhanVien_DTO nhanVien : nhanVienList) {
        //     System.out.println(nhanVien.toString());
        // }

        // Cập nhật thông tin nhân viên
        // Lấy thông tin nhân viên cần cập nhật dựa trên mã nhân viên
// NhanVien_DTO updatedNhanVien = nhanVienDAO.search("NV001");

// Kiểm tra xem nếu nhân viên tồn tại (không null) thì tiến hành cập nhật thông tin
// if (updatedNhanVien != null) {
//     // Thay đổi thông tin nhân viên
//     updatedNhanVien.setTenNV("Nguyen Van B");
//     updatedNhanVien.setSdt("0123456789");
//     updatedNhanVien.setNgaySinh(LocalDate.now()); // Thay đổi ngày sinh
//     updatedNhanVien.setSdt("NewPhone");
//     updatedNhanVien.setEmail("NewEmail");
//     updatedNhanVien.setDiaChi("NewAddress");
    
//     // Thực hiện cập nhật thông tin nhân viên
//     boolean updateSuccess = nhanVienDAO.update(updatedNhanVien);
    
//     if (updateSuccess) {
//         System.out.println("Cập nhật thông tin nhân viên thành công.");
//     } else {
//         System.out.println("Lỗi khi cập nhật thông tin nhân viên.");
//     }
// } else {
//     System.out.println("Không tìm thấy nhân viên với mã NV001.");
// }


        // // Xoá nhân viên

    //    NhanVien_DTO delete = nhanVienDAO.search("NV001");
    //     boolean deleteSuccess = nhanVienDAO.delete(delete);
    //     if (deleteSuccess) {
    //         System.out.println("Xoá nhân viên thành công.");
    //     } else {
    //         System.out.println("Lỗi khi xoá nhân viên.");
    //     }
    // }
    NhanVien_DTO foundNhanVien = nhanVienDAO.search("NV002");
        
        if (foundNhanVien != null) {
            System.out.println("Nhân viên có mã " + "NV002" + " được tìm thấy:");
            System.out.println("Mã nhân viên: " + foundNhanVien.getMaNV());
            System.out.println("Tên nhân viên: " + foundNhanVien.getTenNV());
            System.out.println("Ngày sinh: " + foundNhanVien.getNgaySinh());
            // Hiển thị các thông tin khác của nhân viên
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + "NV002");
        }
    }
}
