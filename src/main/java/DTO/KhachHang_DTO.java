/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class KhachHang_DTO {
    private String maKH;
    private String tenKH;
    private String sdt;
    private boolean tonTai;

    public KhachHang_DTO() {
    }

    public KhachHang_DTO(String maKH, String tenKH, String sdt, boolean tonTai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.tonTai = tonTai;
    }


    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "KhachHang_DTO{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", ngaySinh="  + ", tonTai=" + tonTai + '}';
    }
    
    
    
}
