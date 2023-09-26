/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Nhanvien;

/**
 *
 * @author pc
 */
public class NewClass {
     public static void main(String[] args) {
        NhanvienDao nvDao=new NhanvienDao();
        Nhanvien nv=new Nhanvien("Ma_nv", "Ten_nv","04-10-2003", "Gioi_tinh", "CCCD", "SDT"," Dia_chi","NVBH203", "20-01-2023","01-01-1970", "email", 12312, Boolean.TRUE);
        nvDao.ReadNhanviens();
        nvDao.update(nv);
        for(Nhanvien temp:nvDao.ReadNhanviens())
        {
            System.out.println(temp.toString());
        }
    }
}
