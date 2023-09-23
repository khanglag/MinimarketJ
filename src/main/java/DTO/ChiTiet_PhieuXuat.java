/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTiet_PhieuXuat {
    private String Ma_phieuXuat;
    private String Ma_hangXuat;
    private int soLuong_yeuCau;
    private int soLuong_thucXuat;
    private String donVi;
    private double donGia;
    private double thanhTien;
    private boolean tonTai;

    public ChiTiet_PhieuXuat() {
    }

    public ChiTiet_PhieuXuat(String Ma_phieuXuat, String Ma_hangXuat, int soLuong_yeuCau, int soLuong_thucXuat, String donVi, double donGia, double thanhTien, boolean tonTai) {
        this.Ma_phieuXuat = Ma_phieuXuat;
        this.Ma_hangXuat = Ma_hangXuat;
        this.soLuong_yeuCau = soLuong_yeuCau;
        this.soLuong_thucXuat = soLuong_thucXuat;
        this.donVi = donVi;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.tonTai = tonTai;
    }

    public String getMa_phieuXuat() {
        return Ma_phieuXuat;
    }

    public void setMa_phieuXuat(String Ma_phieuXuat) {
        this.Ma_phieuXuat = Ma_phieuXuat;
    }

    public String getMa_hangXuat() {
        return Ma_hangXuat;
    }

    public void setMa_hangXuat(String Ma_hangXuat) {
        this.Ma_hangXuat = Ma_hangXuat;
    }

    public int getSoLuong_yeuCau() {
        return soLuong_yeuCau;
    }

    public void setSoLuong_yeuCau(int soLuong_yeuCau) {
        this.soLuong_yeuCau = soLuong_yeuCau;
    }

    public int getSoLuong_thucXuat() {
        return soLuong_thucXuat;
    }

    public void setSoLuong_thucXuat(int soLuong_thucXuat) {
        this.soLuong_thucXuat = soLuong_thucXuat;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "ChiTiet_PhieuXuat{" + "Ma_phieuXuat=" + Ma_phieuXuat + ", Ma_hangXuat=" + Ma_hangXuat + ", soLuong_yeuCau=" + soLuong_yeuCau + ", soLuong_thucXuat=" + soLuong_thucXuat + ", donVi=" + donVi + ", donGia=" + donGia + ", thanhTien=" + thanhTien + ", tonTai=" + tonTai + '}';
    }
    
    
    
}
