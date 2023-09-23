/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTONew;

/**
 *
 * @author pc
 */
public class Phieunhap {
     private String Ma_pn;
    private String Ma_nv;
    private String Ma_sp;
    private String Ma_ncc;
    private String Ngay_tp;
    private double VAT;
    private double Gia_nhap;
    private double Gia_ban;
    private int soluong;

    public Phieunhap() {
    }

    public Phieunhap(String Ma_pn, String Ma_nv, String Ma_sp, String Ma_ncc, String Ngay_tp, double VAT, double Gia_nhap, double Gia_ban, int soluong) {
        this.Ma_pn = Ma_pn;
        this.Ma_nv = Ma_nv;
        this.Ma_sp = Ma_sp;
        this.Ma_ncc = Ma_ncc;
        this.Ngay_tp = Ngay_tp;
        this.VAT = VAT;
        this.Gia_nhap = Gia_nhap;
        this.Gia_ban = Gia_ban;
        this.soluong = soluong;
    }

    public String getMa_pn() {
        return this.Ma_pn;
    }

    public void setMa_pn(String Ma_pn) {
        this.Ma_pn = Ma_pn;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getMa_sp() {
        return this.Ma_sp;
    }

    public void setMa_sp(String Ma_sp) {
        this.Ma_sp = Ma_sp;
    }

    public String getMa_ncc() {
        return this.Ma_ncc;
    }

    public void setMa_ncc(String Ma_ncc) {
        this.Ma_ncc = Ma_ncc;
    }

    public String getNgay_tp() {
        return this.Ngay_tp;
    }

    public void setNgay_tp(String Ngay_tp) {
        this.Ngay_tp = Ngay_tp;
    }

    public double getVAT() {
        return this.VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getGia_nhap() {
        return this.Gia_nhap;
    }

    public void setGia_nhap(double Gia_nhap) {
        this.Gia_nhap = Gia_nhap;
    }

    public double getGia_ban() {
        return this.Gia_ban;
    }

    public void setGia_ban(double Gia_ban) {
        this.Gia_ban = Gia_ban;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Phieunhap Ma_pn(String Ma_pn) {
        setMa_pn(Ma_pn);
        return this;
    }

    public Phieunhap Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Phieunhap Ma_sp(String Ma_sp) {
        setMa_sp(Ma_sp);
        return this;
    }

    public Phieunhap Ma_ncc(String Ma_ncc) {
        setMa_ncc(Ma_ncc);
        return this;
    }

    public Phieunhap Ngay_tp(String Ngay_tp) {
        setNgay_tp(Ngay_tp);
        return this;
    }

    public Phieunhap VAT(double VAT) {
        setVAT(VAT);
        return this;
    }

    public Phieunhap Gia_nhap(double Gia_nhap) {
        setGia_nhap(Gia_nhap);
        return this;
    }

    public Phieunhap Gia_ban(double Gia_ban) {
        setGia_ban(Gia_ban);
        return this;
    }

    public Phieunhap soluong(int soluong) {
        setSoluong(soluong);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_pn='" + getMa_pn() + "'" +
            ", Ma_nv='" + getMa_nv() + "'" +
            ", Ma_sp='" + getMa_sp() + "'" +
            ", Ma_ncc='" + getMa_ncc() + "'" +
            ", Ngay_tp='" + getNgay_tp() + "'" +
            ", VAT='" + getVAT() + "'" +
            ", Gia_nhap='" + getGia_nhap() + "'" +
            ", Gia_ban='" + getGia_ban() + "'" +
            ", soluong='" + getSoluong() + "'" +
            "}";
    }
}
