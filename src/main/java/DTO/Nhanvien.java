/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Nhanvien {
    private String Ma_nv;
    private String Ten_nv;
    private String Ngay_sinh;
    private String Gioi_tinh;
    private String CCCD;
    private String SDT;
    private String Dia_chi;
    private String Ma_quyen;
    private String Ngay_lam;
    private String Ngay_nghi;
    private String email;
    private double hs_luong;

    public Nhanvien() {
    }

    public Nhanvien(String Ma_nv, String Ten_nv, String Ngay_sinh, String Gioi_tinh, String CCCD, String SDT, String Dia_chi, String Ma_quyen, String Ngay_lam, String Ngay_nghi, String email, double hs_luong) {
        this.Ma_nv = Ma_nv;
        this.Ten_nv = Ten_nv;
        this.Ngay_sinh = Ngay_sinh;
        this.Gioi_tinh = Gioi_tinh;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.Dia_chi = Dia_chi;
        this.Ma_quyen = Ma_quyen;
        this.Ngay_lam = Ngay_lam;
        this.Ngay_nghi = Ngay_nghi;
        this.email = email;
        this.hs_luong = hs_luong;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getTen_nv() {
        return this.Ten_nv;
    }

    public void setTen_nv(String Ten_nv) {
        this.Ten_nv = Ten_nv;
    }

    public String getNgay_sinh() {
        return this.Ngay_sinh;
    }

    public void setNgay_sinh(String Ngay_sinh) {
        this.Ngay_sinh = Ngay_sinh;
    }

    public String getGioi_tinh() {
        return this.Gioi_tinh;
    }

    public void setGioi_tinh(String Gioi_tinh) {
        this.Gioi_tinh = Gioi_tinh;
    }

    public String getCCCD() {
        return this.CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSDT() {
        return this.SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDia_chi() {
        return this.Dia_chi;
    }

    public void setDia_chi(String Dia_chi) {
        this.Dia_chi = Dia_chi;
    }

    public String getMa_quyen() {
        return this.Ma_quyen;
    }

    public void setMa_quyen(String Ma_quyen) {
        this.Ma_quyen = Ma_quyen;
    }

    public String getNgay_lam() {
        return this.Ngay_lam;
    }

    public void setNgay_lam(String Ngay_lam) {
        this.Ngay_lam = Ngay_lam;
    }

    public String getNgay_nghi() {
        return this.Ngay_nghi;
    }

    public void setNgay_nghi(String Ngay_nghi) {
        this.Ngay_nghi = Ngay_nghi;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHs_luong() {
        return this.hs_luong;
    }

    public void setHs_luong(double hs_luong) {
        this.hs_luong = hs_luong;
    }

    public Nhanvien Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Nhanvien Ten_nv(String Ten_nv) {
        setTen_nv(Ten_nv);
        return this;
    }

    public Nhanvien Ngay_sinh(String Ngay_sinh) {
        setNgay_sinh(Ngay_sinh);
        return this;
    }

    public Nhanvien Gioi_tinh(String Gioi_tinh) {
        setGioi_tinh(Gioi_tinh);
        return this;
    }

    public Nhanvien CCCD(String CCCD) {
        setCCCD(CCCD);
        return this;
    }

    public Nhanvien SDT(String SDT) {
        setSDT(SDT);
        return this;
    }

    public Nhanvien Dia_chi(String Dia_chi) {
        setDia_chi(Dia_chi);
        return this;
    }

    public Nhanvien Ma_quyen(String Ma_quyen) {
        setMa_quyen(Ma_quyen);
        return this;
    }

    public Nhanvien Ngay_lam(String Ngay_lam) {
        setNgay_lam(Ngay_lam);
        return this;
    }

    public Nhanvien Ngay_nghi(String Ngay_nghi) {
        setNgay_nghi(Ngay_nghi);
        return this;
    }

    public Nhanvien email(String email) {
        setEmail(email);
        return this;
    }

    public Nhanvien hs_luong(double hs_luong) {
        setHs_luong(hs_luong);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_nv='" + getMa_nv() + "'" +
            ", Ten_nv='" + getTen_nv() + "'" +
            ", Ngay_sinh='" + getNgay_sinh() + "'" +
            ", Gioi_tinh='" + getGioi_tinh() + "'" +
            ", CCCD='" + getCCCD() + "'" +
            ", SDT='" + getSDT() + "'" +
            ", Dia_chi='" + getDia_chi() + "'" +
            ", Ma_quyen='" + getMa_quyen() + "'" +
            ", Ngay_lam='" + getNgay_lam() + "'" +
            ", Ngay_nghi='" + getNgay_nghi() + "'" +
            ", email='" + getEmail() + "'" +
            ", hs_luong='" + getHs_luong() + "'" +
            "}";
    }
}
