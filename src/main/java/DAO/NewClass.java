/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Hoadon;
import DTO.Nhanvien;

/**
 *
 * @author pc
 */
public class NewClass {
     public static void main(String[] args) {
        HoadonDAO hdao=new HoadonDAO();
        for(Hoadon hd: hdao.ReadHoadons()){
            System.out.println(hd.toString());
        }
    }
}
