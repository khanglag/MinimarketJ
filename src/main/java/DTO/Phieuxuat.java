/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author béo
 */
public class Phieuxuat {
    private String Ma_px;
    private String Ma_nv;
    private String Ngay_tao;
    private String Ma_sp;
    private int So_luong;
    private String lido;

    public Phieuxuat() {
    }

    public Phieuxuat(String Ma_px, String Ma_nv, String Ngay_tao, String Ma_sp, int So_luong, String lido) {
        this.Ma_px = Ma_px;
        this.Ma_nv = Ma_nv;
        this.Ngay_tao = Ngay_tao;
        this.Ma_sp = Ma_sp;
        this.So_luong = So_luong;
        this.lido = lido;
    }

    public String getMa_px() {
        return this.Ma_px;
    }

    public void setMa_px(String Ma_px) {
        this.Ma_px = Ma_px;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getNgay_tao() {
        return this.Ngay_tao;
    }

    public void setNgay_tao(String Ngay_tao) {
        this.Ngay_tao = Ngay_tao;
    }

    public String getMa_sp() {
        return this.Ma_sp;
    }

    public void setMa_sp(String Ma_sp) {
        this.Ma_sp = Ma_sp;
    }

    public int getSo_luong() {
        return this.So_luong;
    }

    public void setSo_luong(int So_luong) {
        this.So_luong = So_luong;
    }

    public String getLido() {
        return this.lido;
    }

    public void setLido(String lido) {
        this.lido = lido;
    }

    public Phieuxuat Ma_px(String Ma_px) {
        setMa_px(Ma_px);
        return this;
    }

    public Phieuxuat Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Phieuxuat Ngay_tao(String Ngay_tao) {
        setNgay_tao(Ngay_tao);
        return this;
    }

    public Phieuxuat Ma_sp(String Ma_sp) {
        setMa_sp(Ma_sp);
        return this;
    }

    public Phieuxuat So_luong(int So_luong) {
        setSo_luong(So_luong);
        return this;
    }

    public Phieuxuat lido(String lido) {
        setLido(lido);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_px='" + getMa_px() + "'" +
            ", Ma_nv='" + getMa_nv() + "'" +
            ", Ngay_tao='" + getNgay_tao() + "'" +
            ", Ma_sp='" + getMa_sp() + "'" +
            ", So_luong='" + getSo_luong() + "'" +
            ", lido='" + getLido() + "'" +
            "}";
    }
}
