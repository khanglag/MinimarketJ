/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class PhieuChi {
    private String ma_phieuChi;
    private String ma_soTien;
    private String ma_nv;
    private String thoiGianChi;
    private String lyDo;
    private String ghiChu;
    private boolean tonTai;

    public PhieuChi() {
    }

    public PhieuChi(String ma_phieuChi, String ma_soTien, String ma_nv, String thoiGianChi, String lyDo, String ghiChu, boolean tonTai) {
        this.ma_phieuChi = ma_phieuChi;
        this.ma_soTien = ma_soTien;
        this.ma_nv = ma_nv;
        this.thoiGianChi = thoiGianChi;
        this.lyDo = lyDo;
        this.ghiChu = ghiChu;
        this.tonTai = tonTai;
    }
    
    

    public String getMa_phieuChi() {
        return ma_phieuChi;
    }

    public void setMa_phieuChi(String ma_phieuChi) {
        this.ma_phieuChi = ma_phieuChi;
    }

    public String getMa_soTien() {
        return ma_soTien;
    }

    public void setMa_soTien(String ma_soTien) {
        this.ma_soTien = ma_soTien;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getThoiGianChi() {
        return thoiGianChi;
    }

    public void setThoiGianChi(String thoiGianChi) {
        this.thoiGianChi = thoiGianChi;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "PhieuChi{" + "ma_phieuChi=" + ma_phieuChi + ", ma_soTien=" + ma_soTien + ", ma_nv=" + ma_nv + ", thoiGianChi=" + thoiGianChi + ", lyDo=" + lyDo + ", ghiChu=" + ghiChu + ", tonTai=" + tonTai + '}';
    }
    
    
    
}