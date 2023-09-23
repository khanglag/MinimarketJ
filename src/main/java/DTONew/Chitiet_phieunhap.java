/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTONew;

/**
 *
 * @author pc
 */
public class Chitiet_phieunhap {
    private String Ma_pn;
    private String Ma_hn;
    private String Tenhang;
    private double VAT;
    private int Soluong;
    private String Donvi;
    private double Gianhap;
    private double Tongtien;
    private boolean Tontai;

    public Chitiet_phieunhap() {
    }

    public Chitiet_phieunhap(String Ma_pn, String Ma_hn, String Tenhang, double VAT, int Soluong, String Donvi, double Gianhap, double Tongtien, boolean Tontai) {
        this.Ma_pn = Ma_pn;
        this.Ma_hn = Ma_hn;
        this.Tenhang = Tenhang;
        this.VAT = VAT;
        this.Soluong = Soluong;
        this.Donvi = Donvi;
        this.Gianhap = Gianhap;
        this.Tongtien = Tongtien;
        this.Tontai = Tontai;
    }

    public String getMa_pn() {
        return this.Ma_pn;
    }

    public void setMa_pn(String Ma_pn) {
        this.Ma_pn = Ma_pn;
    }

    public String getMa_hn() {
        return this.Ma_hn;
    }

    public void setMa_hn(String Ma_hn) {
        this.Ma_hn = Ma_hn;
    }

    public String getTenhang() {
        return this.Tenhang;
    }

    public void setTenhang(String Tenhang) {
        this.Tenhang = Tenhang;
    }

    public double getVAT() {
        return this.VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public int getSoluong() {
        return this.Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getDonvi() {
        return this.Donvi;
    }

    public void setDonvi(String Donvi) {
        this.Donvi = Donvi;
    }

    public double getGianhap() {
        return this.Gianhap;
    }

    public void setGianhap(double Gianhap) {
        this.Gianhap = Gianhap;
    }

    public double getTongtien() {
        return this.Tongtien;
    }

    public void setTongtien(double Tongtien) {
        this.Tongtien = Tongtien;
    }

    public boolean isTontai() {
        return this.Tontai;
    }

    public boolean getTontai() {
        return this.Tontai;
    }

    public void setTontai(boolean Tontai) {
        this.Tontai = Tontai;
    }

    public Chitiet_phieunhap Ma_pn(String Ma_pn) {
        setMa_pn(Ma_pn);
        return this;
    }

    public Chitiet_phieunhap Ma_hn(String Ma_hn) {
        setMa_hn(Ma_hn);
        return this;
    }

    public Chitiet_phieunhap Tenhang(String Tenhang) {
        setTenhang(Tenhang);
        return this;
    }

    public Chitiet_phieunhap VAT(double VAT) {
        setVAT(VAT);
        return this;
    }

    public Chitiet_phieunhap Soluong(int Soluong) {
        setSoluong(Soluong);
        return this;
    }

    public Chitiet_phieunhap Donvi(String Donvi) {
        setDonvi(Donvi);
        return this;
    }

    public Chitiet_phieunhap Gianhap(double Gianhap) {
        setGianhap(Gianhap);
        return this;
    }

    public Chitiet_phieunhap Tongtien(double Tongtien) {
        setTongtien(Tongtien);
        return this;
    }

    public Chitiet_phieunhap Tontai(boolean Tontai) {
        setTontai(Tontai);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " Ma_pn='" + getMa_pn() + "'" +
            ", Ma_hn='" + getMa_hn() + "'" +
            ", Tenhang='" + getTenhang() + "'" +
            ", VAT='" + getVAT() + "'" +
            ", Soluong='" + getSoluong() + "'" +
            ", Donvi='" + getDonvi() + "'" +
            ", Gianhap='" + getGianhap() + "'" +
            ", Tongtien='" + getTongtien() + "'" +
            ", Tontai='" + isTontai() + "'" +
            "}";
    }
}
