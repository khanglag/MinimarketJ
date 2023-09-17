/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Phieuchi {
    private String Ma_pc;
    private String Ma_nv;
    private String Ngay_chi;
    private double So_tien;
    private String lido;
    private String ghi_chu;

    public Phieuchi() {
    }

    public Phieuchi(String Ma_pc, String Ma_nv, String Ngay_chi, double So_tien, String lido, String ghi_chu) {
        this.Ma_pc = Ma_pc;
        this.Ma_nv = Ma_nv;
        this.Ngay_chi = Ngay_chi;
        this.So_tien = So_tien;
        this.lido = lido;
        this.ghi_chu = ghi_chu;
    }

    public String getMa_pc() {
        return this.Ma_pc;
    }

    public void setMa_pc(String Ma_pc) {
        this.Ma_pc = Ma_pc;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getNgay_chi() {
        return this.Ngay_chi;
    }

    public void setNgay_chi(String Ngay_chi) {
        this.Ngay_chi = Ngay_chi;
    }

    public double getSo_tien() {
        return this.So_tien;
    }

    public void setSo_tien(double So_tien) {
        this.So_tien = So_tien;
    }

    public String getLido() {
        return this.lido;
    }

    public void setLido(String lido) {
        this.lido = lido;
    }

    public String getGhi_chu() {
        return this.ghi_chu;
    }

    public void setGhi_chu(String ghi_chu) {
        this.ghi_chu = ghi_chu;
    }

    public Phieuchi Ma_pc(String Ma_pc) {
        setMa_pc(Ma_pc);
        return this;
    }

    public Phieuchi Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Phieuchi Ngay_chi(String Ngay_chi) {
        setNgay_chi(Ngay_chi);
        return this;
    }

    public Phieuchi So_tien(double So_tien) {
        setSo_tien(So_tien);
        return this;
    }

    public Phieuchi lido(String lido) {
        setLido(lido);
        return this;
    }

    public Phieuchi ghi_chu(String ghi_chu) {
        setGhi_chu(ghi_chu);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " Ma_pc='" + getMa_pc() + "'" +
            ", Ma_nv='" + getMa_nv() + "'" +
            ", Ngay_chi='" + getNgay_chi() + "'" +
            ", So_tien='" + getSo_tien() + "'" +
            ", lido='" + getLido() + "'" +
            ", ghi_chu='" + getGhi_chu() + "'" +
            "}";
    }
}