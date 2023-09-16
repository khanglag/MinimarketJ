/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author beso
 */
public class Khachhang {
    private String Ma_kh;
    private String Ten_kh;
    private String Ngay_sinh;
    private String SDT;
    private String Dia_chi;

    public Khachhang() {
    }

    public Khachhang(String Ma_kh, String Ten_kh, String Ngay_sinh, String SDT, String Dia_chi) {
        this.Ma_kh = Ma_kh;
        this.Ten_kh = Ten_kh;
        this.Ngay_sinh = Ngay_sinh;
        this.SDT = SDT;
        this.Dia_chi = Dia_chi;
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

    public String getNgay_sinh() {
        return this.Ngay_sinh;
    }

    public void setNgay_sinh(String Ngay_sinh) {
        this.Ngay_sinh = Ngay_sinh;
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

    public Khachhang Ma_kh(String Ma_kh) {
        setMa_kh(Ma_kh);
        return this;
    }

    public Khachhang Ten_kh(String Ten_kh) {
        setTen_kh(Ten_kh);
        return this;
    }

    public Khachhang Ngay_sinh(String Ngay_sinh) {
        setNgay_sinh(Ngay_sinh);
        return this;
    }

    public Khachhang SDT(String SDT) {
        setSDT(SDT);
        return this;
    }

    public Khachhang Dia_chi(String Dia_chi) {
        setDia_chi(Dia_chi);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_kh='" + getMa_kh() + "'" +
            ", Ten_kh='" + getTen_kh() + "'" +
            ", Ngay_sinh='" + getNgay_sinh() + "'" +
            ", SDT='" + getSDT() + "'" +
            ", Dia_chi='" + getDia_chi() + "'" +
            "}";
    }
}
