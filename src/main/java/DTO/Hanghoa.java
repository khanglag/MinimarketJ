/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Objects;
import java.awt.print.Printable;

/**
 *
 * @author béo
 */
public class Hanghoa {
    private String Ma_sp;
    private String Ten_sp;
    private String Ma_nsp;
    private String Ngay_sx;
    private String Ncc;
    private String D_vi;
    private double G_nhap;
    private double G_ban;
    private int S_luong;
    private String xuat_su;

    public Hanghoa() {
    }

    public Hanghoa(String Ma_sp, String Ten_sp, String Ma_nsp, String Ngay_sx, String Ncc, String D_vi, double G_nhap, double G_ban, int S_luong, String xuat_su) {
        this.Ma_sp = Ma_sp;
        this.Ten_sp = Ten_sp;
        this.Ma_nsp = Ma_nsp;
        this.Ngay_sx = Ngay_sx;
        this.Ncc = Ncc;
        this.D_vi = D_vi;
        this.G_nhap = G_nhap;
        this.G_ban = G_ban;
        this.S_luong = S_luong;
        this.xuat_su = xuat_su;
    }

    public String getMa_sp() {
        return this.Ma_sp;
    }

    public void setMa_sp(String Ma_sp) {
        this.Ma_sp = Ma_sp;
    }

    public String getTen_sp() {
        return this.Ten_sp;
    }

    public void setTen_sp(String Ten_sp) {
        this.Ten_sp = Ten_sp;
    }

    public String getMa_nsp() {
        return this.Ma_nsp;
    }

    public void setMa_nsp(String Ma_nsp) {
        this.Ma_nsp = Ma_nsp;
    }

    public String getNgay_sx() {
        return this.Ngay_sx;
    }

    public void setNgay_sx(String Ngay_sx) {
        this.Ngay_sx = Ngay_sx;
    }

    public String getNcc() {
        return this.Ncc;
    }

    public void setNcc(String Ncc) {
        this.Ncc = Ncc;
    }

    public String getD_vi() {
        return this.D_vi;
    }

    public void setD_vi(String D_vi) {
        this.D_vi = D_vi;
    }

    public double getG_nhap() {
        return this.G_nhap;
    }

    public void setG_nhap(double G_nhap) {
        this.G_nhap = G_nhap;
    }

    public double getG_ban() {
        return this.G_ban;
    }

    public void setG_ban(double G_ban) {
        this.G_ban = G_ban;
    }

    public int getS_luong() {
        return this.S_luong;
    }

    public void setS_luong(int S_luong) {
        this.S_luong = S_luong;
    }

    public String getXuat_su() {
        return this.xuat_su;
    }

    public void setXuat_su(String xuat_su) {
        this.xuat_su = xuat_su;
    }

    public Hanghoa Ma_sp(String Ma_sp) {
        setMa_sp(Ma_sp);
        return this;
    }

    public Hanghoa Ten_sp(String Ten_sp) {
        setTen_sp(Ten_sp);
        return this;
    }

    public Hanghoa Ma_nsp(String Ma_nsp) {
        setMa_nsp(Ma_nsp);
        return this;
    }

    public Hanghoa Ngay_sx(String Ngay_sx) {
        setNgay_sx(Ngay_sx);
        return this;
    }

    public Hanghoa Ncc(String Ncc) {
        setNcc(Ncc);
        return this;
    }

    public Hanghoa D_vi(String D_vi) {
        setD_vi(D_vi);
        return this;
    }

    public Hanghoa G_nhap(double G_nhap) {
        setG_nhap(G_nhap);
        return this;
    }

    public Hanghoa G_ban(double G_ban) {
        setG_ban(G_ban);
        return this;
    }

    public Hanghoa S_luong(int S_luong) {
        setS_luong(S_luong);
        return this;
    }

    public Hanghoa xuat_su(String xuat_su) {
        setXuat_su(xuat_su);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_sp='" + getMa_sp() + "'" +
            ", Ten_sp='" + getTen_sp() + "'" +
            ", Ma_nsp='" + getMa_nsp() + "'" +
            ", Ngay_sx='" + getNgay_sx() + "'" +
            ", Ncc='" + getNcc() + "'" +
            ", D_vi='" + getD_vi() + "'" +
            ", G_nhap='" + getG_nhap() + "'" +
            ", G_ban='" + getG_ban() + "'" +
            ", S_luong='" + getS_luong() + "'" +
            ", xuat_su='" + getXuat_su() + "'" +
            "}";
    }
    
}
