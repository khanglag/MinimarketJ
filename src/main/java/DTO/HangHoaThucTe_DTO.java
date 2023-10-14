/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class HangHoaThucTe_DTO {
    private String maSP;
    private String tenSP;
    private String donVi;
    private int soLuongThucTe;
    private String ngayKiem;
    private boolean tonTai;

    public HangHoaThucTe_DTO() {
    }

    public HangHoaThucTe_DTO(String maSP, String tenSP, String donVi, int soLuongThucTe, String ngayKiem, boolean tonTai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donVi = donVi;
        this.soLuongThucTe = soLuongThucTe;
        this.ngayKiem = ngayKiem;
        this.tonTai = tonTai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getSoLuongThucTe() {
        return soLuongThucTe;
    }

    public void setSoLuongThucTe(int soLuongThucTe) {
        this.soLuongThucTe = soLuongThucTe;
    }

    public String getNgayKiem() {
        return ngayKiem;
    }

    public void setNgayKiem(String ngayKiem) {
        this.ngayKiem = ngayKiem;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "HangHoaThucTe_DTO{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donVi=" + donVi + ", soLuongThucTe=" + soLuongThucTe + ", ngayKiem=" + ngayKiem + ", tonTai=" + tonTai + '}';
    }
    
    
    
}
