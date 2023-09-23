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
        Nhanvien nv=new Nhanvien(Ma_nv, Ten_nv, Ngay_sinh, Gioi_tinh, CCCD, SDT, Dia_chi, Ma_quyen, Ngay_lam, Ngay_nghi, email, 0, Boolean.TRUE);
        nvDao.ReadNhanviens();
        for(Nhanvien temp:nvDao.ReadNhanviens())
        {
            System.out.println(temp.toString());
        }
    }
}
