package DAO;

import java.util.ArrayList;
import DAO.HangHoaDAO;
import DTO.HangHoa_DTO;

public class TestHangHoaDAO {
    public static void main(String[] args) {
        HangHoaDAO hangHoaDAO = new HangHoaDAO(); // Tạo một đối tượng HangHoaDAO
        
        // Gọi hàm ReadHangHoa để lấy danh sách hàng hóa từ cơ sở dữ liệu
        ArrayList<HangHoa_DTO> hangHoaList = hangHoaDAO.ReadHangHoa();
        
        // Kiểm tra và hiển thị kết quả
        if (hangHoaList != null) {
            System.out.println("Danh sách hàng hóa:");
            for (HangHoa_DTO hh : hangHoaList) {
                System.out.println("Mã SP: " + hh.getMaSP());
                System.out.println("Tên SP: " + hh.getTenSP());
                // Hiển thị các thông tin khác của hàng hóa tương tự ở đây
                
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("Không có hàng hóa nào hoặc có lỗi xảy ra trong quá trình truy vấn.");
        }
    }
}
