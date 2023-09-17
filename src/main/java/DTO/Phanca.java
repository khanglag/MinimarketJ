/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Phanca {
    private String Ma_ca;
    private String Ma_nv;
    private String Tg;
       public Phanca() {
    }

    public Phanca(String Ma_ca, String Ma_nv, String Tg) {
        this.Ma_ca = Ma_ca;
        this.Ma_nv = Ma_nv;
        this.Tg = Tg;
    }

    public String getMa_ca() {
        return this.Ma_ca;
    }

    public void setMa_ca(String Ma_ca) {
        this.Ma_ca = Ma_ca;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getTg() {
        return this.Tg;
    }

    public void setTg(String Tg) {
        this.Tg = Tg;
    }

    public Phanca Ma_ca(String Ma_ca) {
        setMa_ca(Ma_ca);
        return this;
    }

    public Phanca Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Phanca Tg(String Tg) {
        setTg(Tg);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_ca='" + getMa_ca() + "'" +
            ", Ma_nv='" + getMa_nv() + "'" +
            ", Tg='" + getTg() + "'" +
            "}";
    }
}
