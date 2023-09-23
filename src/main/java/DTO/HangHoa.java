/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class HangHoa {
    private String Ma_sp;
    private String ten_sp;
    private String Ma_nh;
    private String Ma_ncc;
    private String donVi;
    private double Gia_nhap;
    private double Gia_ban;
    private int soLuong;
    private String xuatXu;
    private boolean tonTai;

    public HangHoa() {
    }

    public HangHoa(String Ma_sp, String ten_sp, String Ma_nh, String Ma_ncc, String donVi, double Gia_nhap, double Gia_ban, int soLuong, String xuatXu, boolean tonTai) {
        this.Ma_sp = Ma_sp;
        this.ten_sp = ten_sp;
        this.Ma_nh = Ma_nh;
        this.Ma_ncc = Ma_ncc;
        this.donVi = donVi;
        this.Gia_nhap = Gia_nhap;
        this.Gia_ban = Gia_ban;
        this.soLuong = soLuong;
        this.xuatXu = xuatXu;
        this.tonTai = tonTai;
    }

    public String getMa_sp() {
        return Ma_sp;
    }

    public void setMa_sp(String Ma_sp) {
        this.Ma_sp = Ma_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getMa_nh() {
        return Ma_nh;
    }

    public void setMa_nh(String Ma_nh) {
        this.Ma_nh = Ma_nh;
    }

    public String getMa_ncc() {
        return Ma_ncc;
    }

    public void setMa_ncc(String Ma_ncc) {
        this.Ma_ncc = Ma_ncc;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getGia_nhap() {
        return Gia_nhap;
    }

    public void setGia_nhap(double Gia_nhap) {
        this.Gia_nhap = Gia_nhap;
    }

    public double getGia_ban() {
        return Gia_ban;
    }

    public void setGia_ban(double Gia_ban) {
        this.Gia_ban = Gia_ban;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "Ma_sp=" + Ma_sp + ", ten_sp=" + ten_sp + ", Ma_nh=" + Ma_nh + ", Ma_ncc=" + Ma_ncc + ", donVi=" + donVi + ", Gia_nhap=" + Gia_nhap + ", Gia_ban=" + Gia_ban + ", soLuong=" + soLuong + ", xuatXu=" + xuatXu + ", tonTai=" + tonTai + '}';
    }
    
    
    
}
