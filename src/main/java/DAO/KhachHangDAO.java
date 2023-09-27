/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author khang
 */
public class KhachHangDAO {
    
    public KhachHangDAO{
    
}
    ConnectDB connectDB;
    ArrayList<Khachhang> dskh = new ArrayList<Khachhang>();
    
    public ArrayList<Khachhang> readDB(){
        connectDB = new ConnectDB();
        try{
            String qry = "SELECT *FROM KHACHHANG WHERE TONTAI =1";
            ResultSet rset = connectDB.sqlQuery(qry);
            if(rset != null){
                while(rset.next()){
                    Khachhang kh = new Khachhang(rset.getNString("Ma_kh")),
                                            rset.getNString()
                }
            }
        }
    }
    
    
}
