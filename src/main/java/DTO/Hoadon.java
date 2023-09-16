/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author béo
 * 
 */
public class Hoadon {
    private String So_hd;
    private String Ma_nv;
    private String Ngay_lap;
    private String Ma_kh;
    private double Tien_kd;
    private double Tien_kt;
    private double VAT;
    private double Thanh_tien;

    public Hoadon() {
    }

    public Hoadon(String So_hd, String Ma_nv, String Ngay_lap, String Ma_kh, double Tien_kd, double Tien_kt, double VAT, double Thanh_tien) {
        this.So_hd = So_hd;
        this.Ma_nv = Ma_nv;
        this.Ngay_lap = Ngay_lap;
        this.Ma_kh = Ma_kh;
        this.Tien_kd = Tien_kd;
        this.Tien_kt = Tien_kt;
        this.VAT = VAT;
        this.Thanh_tien = Thanh_tien;
    }

    public String getSo_hd() {
        return this.So_hd;
    }

    public void setSo_hd(String So_hd) {
        this.So_hd = So_hd;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getNgay_lap() {
        return this.Ngay_lap;
    }

    public void setNgay_lap(String Ngay_lap) {
        this.Ngay_lap = Ngay_lap;
    }

    public String getMa_kh() {
        return this.Ma_kh;
    }

    public void setMa_kh(String Ma_kh) {
        this.Ma_kh = Ma_kh;
    }

    public double getTien_kd() {
        return this.Tien_kd;
    }

    public void setTien_kd(double Tien_kd) {
        this.Tien_kd = Tien_kd;
    }

    public double getTien_kt() {
        return this.Tien_kt;
    }

    public void setTien_kt(double Tien_kt) {
        this.Tien_kt = Tien_kt;
    }

    public double getVAT() {
        return this.VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getThanh_tien() {
        return this.Thanh_tien;
    }

    public void setThanh_tien(double Thanh_tien) {
        this.Thanh_tien = Thanh_tien;
    }

    public Hoadon So_hd(String So_hd) {
        setSo_hd(So_hd);
        return this;
    }

    public Hoadon Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Hoadon Ngay_lap(String Ngay_lap) {
        setNgay_lap(Ngay_lap);
        return this;
    }

    public Hoadon Ma_kh(String Ma_kh) {
        setMa_kh(Ma_kh);
        return this;
    }

    public Hoadon Tien_kd(double Tien_kd) {
        setTien_kd(Tien_kd);
        return this;
    }

    public Hoadon Tien_kt(double Tien_kt) {
        setTien_kt(Tien_kt);
        return this;
    }

    public Hoadon VAT(double VAT) {
        setVAT(VAT);
        return this;
    }

    public Hoadon Thanh_tien(double Thanh_tien) {
        setThanh_tien(Thanh_tien);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " So_hd='" + getSo_hd() + "'" +
            ", Ma_nv='" + getMa_nv() + "'" +
            ", Ngay_lap='" + getNgay_lap() + "'" +
            ", Ma_kh='" + getMa_kh() + "'" +
            ", Tien_kd='" + getTien_kd() + "'" +
            ", Tien_kt='" + getTien_kt() + "'" +
            ", VAT='" + getVAT() + "'" +
            ", Thanh_tien='" + getThanh_tien() + "'" +
            "}";
    }
      
}
