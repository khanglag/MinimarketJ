/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Chamcong {
    private String Ma_nv;
    private String Thoigian_in;
    private String Thoigian_out;
    private String Tong_gio;
     public Chamcong() {
    }

    public Chamcong(String Ma_nv, String Thoigian_in, String Thoigian_out, String Tong_gio) {
        this.Ma_nv = Ma_nv;
        this.Thoigian_in = Thoigian_in;
        this.Thoigian_out = Thoigian_out;
        this.Tong_gio = Tong_gio;
    }

    public String getMa_nv() {
        return this.Ma_nv;
    }

    public void setMa_nv(String Ma_nv) {
        this.Ma_nv = Ma_nv;
    }

    public String getThoigian_in() {
        return this.Thoigian_in;
    }

    public void setThoigian_in(String Thoigian_in) {
        this.Thoigian_in = Thoigian_in;
    }

    public String getThoigian_out() {
        return this.Thoigian_out;
    }

    public void setThoigian_out(String Thoigian_out) {
        this.Thoigian_out = Thoigian_out;
    }

    public String getTong_gio() {
        return this.Tong_gio;
    }

    public void setTong_gio(String Tong_gio) {
        this.Tong_gio = Tong_gio;
    }

    public Chamcong Ma_nv(String Ma_nv) {
        setMa_nv(Ma_nv);
        return this;
    }

    public Chamcong Thoigian_in(String Thoigian_in) {
        setThoigian_in(Thoigian_in);
        return this;
    }

    public Chamcong Thoigian_out(String Thoigian_out) {
        setThoigian_out(Thoigian_out);
        return this;
    }

    public Chamcong Tong_gio(String Tong_gio) {
        setTong_gio(Tong_gio);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_nv='" + getMa_nv() + "'" +
            ", Thoigian_in='" + getThoigian_in() + "'" +
            ", Thoigian_out='" + getThoigian_out() + "'" +
            ", Tong_gio='" + getTong_gio() + "'" +
            "}";
    }
    
}
