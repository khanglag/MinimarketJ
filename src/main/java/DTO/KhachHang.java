/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String Ma_kh;
    private String Ten_kh;
    private String NgaySinh;
    private String sdt;
    private String Cccd;
    private String Diachi;
    private boolean TonTai;
    public KhachHang() {
    }

    public KhachHang(String Ma_kh, String Ten_kh, String NgaySinh, String sdt, String Cccd, String Diachi, boolean TonTai) {
        this.Ma_kh = Ma_kh;
        this.Ten_kh = Ten_kh;
        this.NgaySinh = NgaySinh;
        this.sdt = sdt;
        this.Cccd = Cccd;
        this.Diachi = Diachi;
        this.TonTai = TonTai;
    }

    public String getMa_kh() {
        return this.Ma_kh;
    }

    public void setMa_kh(String Ma_kh) {
        this.Ma_kh = Ma_kh;
    }

    public String getTen_kh() {
        return this.Ten_kh;
    }

    public void setTen_kh(String Ten_kh) {
        this.Ten_kh = Ten_kh;
    }

    public String getNgaySinh() {
        return this.NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return this.Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public String getDiachi() {
        return this.Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public boolean isTonTai() {
        return this.TonTai;
    }

    public boolean getTonTai() {
        return this.TonTai;
    }

    public void setTonTai(boolean TonTai) {
        this.TonTai = TonTai;
    }

    public KhachHang Ma_kh(String Ma_kh) {
        setMa_kh(Ma_kh);
        return this;
    }

    public KhachHang Ten_kh(String Ten_kh) {
        setTen_kh(Ten_kh);
        return this;
    }

    public KhachHang NgaySinh(String NgaySinh) {
        setNgaySinh(NgaySinh);
        return this;
    }

    public KhachHang sdt(String sdt) {
        setSdt(sdt);
        return this;
    }

    public KhachHang Cccd(String Cccd) {
        setCccd(Cccd);
        return this;
    }

    public KhachHang Diachi(String Diachi) {
        setDiachi(Diachi);
        return this;
    }

    public KhachHang TonTai(boolean TonTai) {
        setTonTai(TonTai);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_kh='" + getMa_kh() + "'" +
            ", Ten_kh='" + getTen_kh() + "'" +
            ", NgaySinh='" + getNgaySinh() + "'" +
            ", sdt='" + getSdt() + "'" +
            ", Cccd='" + getCccd() + "'" +
            ", Diachi='" + getDiachi() + "'" +
            ", TonTai='" + isTonTai() + "'" +
            "}";
    }
}  