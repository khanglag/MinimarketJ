/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Bangiaoca {
    private String Ma_ca1;
    private String Ma_ca2;
    private double So_tien_bg;
    private double So_tien_ht;
    private String Ma_nv1;
    private String Ma_nv2;
    private String Tg_bg;
    public Bangiaoca() {
    }

    public Bangiaoca(String Ma_ca1, String Ma_ca2, double So_tien_bg, double So_tien_ht, String Ma_nv1, String Ma_nv2, String Tg_bg) {
        this.Ma_ca1 = Ma_ca1;
        this.Ma_ca2 = Ma_ca2;
        this.So_tien_bg = So_tien_bg;
        this.So_tien_ht = So_tien_ht;
        this.Ma_nv1 = Ma_nv1;
        this.Ma_nv2 = Ma_nv2;
        this.Tg_bg = Tg_bg;
    }

    public String getMa_ca1() {
        return this.Ma_ca1;
    }

    public void setMa_ca1(String Ma_ca1) {
        this.Ma_ca1 = Ma_ca1;
    }

    public String getMa_ca2() {
        return this.Ma_ca2;
    }

    public void setMa_ca2(String Ma_ca2) {
        this.Ma_ca2 = Ma_ca2;
    }

    public double getSo_tien_bg() {
        return this.So_tien_bg;
    }

    public void setSo_tien_bg(double So_tien_bg) {
        this.So_tien_bg = So_tien_bg;
    }

    public double getSo_tien_ht() {
        return this.So_tien_ht;
    }

    public void setSo_tien_ht(double So_tien_ht) {
        this.So_tien_ht = So_tien_ht;
    }

    public String getMa_nv1() {
        return this.Ma_nv1;
    }

    public void setMa_nv1(String Ma_nv1) {
        this.Ma_nv1 = Ma_nv1;
    }

    public String getMa_nv2() {
        return this.Ma_nv2;
    }

    public void setMa_nv2(String Ma_nv2) {
        this.Ma_nv2 = Ma_nv2;
    }

    public String getTg_bg() {
        return this.Tg_bg;
    }

    public void setTg_bg(String Tg_bg) {
        this.Tg_bg = Tg_bg;
    }

    public Bangiaoca Ma_ca1(String Ma_ca1) {
        setMa_ca1(Ma_ca1);
        return this;
    }

    public Bangiaoca Ma_ca2(String Ma_ca2) {
        setMa_ca2(Ma_ca2);
        return this;
    }

    public Bangiaoca So_tien_bg(double So_tien_bg) {
        setSo_tien_bg(So_tien_bg);
        return this;
    }

    public Bangiaoca So_tien_ht(double So_tien_ht) {
        setSo_tien_ht(So_tien_ht);
        return this;
    }

    public Bangiaoca Ma_nv1(String Ma_nv1) {
        setMa_nv1(Ma_nv1);
        return this;
    }

    public Bangiaoca Ma_nv2(String Ma_nv2) {
        setMa_nv2(Ma_nv2);
        return this;
    }

    public Bangiaoca Tg_bg(String Tg_bg) {
        setTg_bg(Tg_bg);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_ca1='" + getMa_ca1() + "'" +
            ", Ma_ca2='" + getMa_ca2() + "'" +
            ", So_tien_bg='" + getSo_tien_bg() + "'" +
            ", So_tien_ht='" + getSo_tien_ht() + "'" +
            ", Ma_nv1='" + getMa_nv1() + "'" +
            ", Ma_nv2='" + getMa_nv2() + "'" +
            ", Tg_bg='" + getTg_bg() + "'" +
            "}";
    }
    
}
