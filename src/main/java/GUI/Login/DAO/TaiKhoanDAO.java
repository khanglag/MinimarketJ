/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Login.DAO;


import GUI.Login.Taikhoan;

/**
 *
 * @author khang
 */
// chức năng login
public interface TaiKhoanDAO {

    /**
     *
     * @param tenDangNhap
     * @param matKhau
     * @return
     */

    public Taikhoan login(String tenDangNhap, String matKhau);

}
