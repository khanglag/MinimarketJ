/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTiet_HoaDon {
    private int soHD;
    private String ma_sp;
    private int soLuong;
    private boolean tonTai;

    public ChiTiet_HoaDon() {
    }

    public ChiTiet_HoaDon(int soHD, String ma_sp, int soLuong, boolean tonTai) {
        this.soHD = soHD;
        this.ma_sp = ma_sp;
        this.soLuong = soLuong;
        this.tonTai = tonTai;
    }

    public int getSoHD() {
        return soHD;
    }

    public void setSoHD(int soHD) {
        this.soHD = soHD;
    }

    public String getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(String ma_sp) {
        this.ma_sp = ma_sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "ChiTiet_HoaDon{" + "soHD=" + soHD + ", ma_sp=" + ma_sp + ", soLuong=" + soLuong + ", tonTai=" + tonTai + '}';
    }
    
    
    
}
