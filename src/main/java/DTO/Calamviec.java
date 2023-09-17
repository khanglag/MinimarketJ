/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Calamviec {
    private String Ma_ca;
    private String Tg_bd;
    private String Tg_kt;
      public Calamviec() {
    }

    public Calamviec(String Ma_ca, String Tg_bd, String Tg_kt) {
        this.Ma_ca = Ma_ca;
        this.Tg_bd = Tg_bd;
        this.Tg_kt = Tg_kt;
    }

    public String getMa_ca() {
        return this.Ma_ca;
    }

    public void setMa_ca(String Ma_ca) {
        this.Ma_ca = Ma_ca;
    }

    public String getTg_bd() {
        return this.Tg_bd;
    }

    public void setTg_bd(String Tg_bd) {
        this.Tg_bd = Tg_bd;
    }

    public String getTg_kt() {
        return this.Tg_kt;
    }

    public void setTg_kt(String Tg_kt) {
        this.Tg_kt = Tg_kt;
    }

    public Calamviec Ma_ca(String Ma_ca) {
        setMa_ca(Ma_ca);
        return this;
    }

    public Calamviec Tg_bd(String Tg_bd) {
        setTg_bd(Tg_bd);
        return this;
    }

    public Calamviec Tg_kt(String Tg_kt) {
        setTg_kt(Tg_kt);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " Ma_ca='" + getMa_ca() + "'" +
            ", Tg_bd='" + getTg_bd() + "'" +
            ", Tg_kt='" + getTg_kt() + "'" +
            "}";
    }
}
