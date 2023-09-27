package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import DTO.HangHoa;

public class HangHoaDAO {
    public HangHoaDAO(){

    }
    public ArrayList<HangHoa> ReadHangHoa(){
        ConnectDB connectDB ;
        connectDB = new ConnectDB();
        ArrayList<HangHoa> hhArrayList = new ArrayList<>();
        String qry ="SELECT * FROM 'hanghoa' WHERE TONTAI = 1";
        ResultSet rSet = connectDB.sqlQuery(qry);
        try {
            if(rSet != null) {
                while(rSet.next()) {
                    HangHoa hh = new HangHoa(rSet.getNString("MASP"), rSet.getNString("TENSP"), rSet.getNString("MANH"), rSet.getNString("MANCC"), rSet.getNString("DONVI"),rSet.getInt("GIANHAP"), rSet.getInt("GIABAN"), rSet.getInt("SOLUONG"), rSet.getNString("XUATXU"), rSet.getBoolean("TONTAI"));
                    hhArrayList.add(hh);
                }
            }
        } catch(Exception e) {
            System.out.println("Lỗi truy vấn Hàng hóa");
            e.printStackTrace();
        }
        connectDB.closeConnect();
        return hhArrayList;
        
    }
    
}
