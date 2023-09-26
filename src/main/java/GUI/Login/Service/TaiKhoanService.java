/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Login.Service;

import DTO.Taikhoan;

/**
 *
 * @author khang
 */
//chức năng login
public interface TaiKhoanService {
    public Taikhoan login(String tenDangNhap, String matKhau);
}
