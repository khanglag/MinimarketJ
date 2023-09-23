/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author pc
 */
public class Nhacungcap {
     private String Ma_ncc;
    private String Ten_ncc;
    private String SDT;
    private String Diachi;

    public Nhacungcap() {
    }

    public Nhacungcap(String Ma_ncc, String Ten_ncc, String SDT, String Diachi) {
        this.Ma_ncc = Ma_ncc;
        this.Ten_ncc = Ten_ncc;
        this.SDT = SDT;
        this.Diachi = Diachi;
    }

    public String getMa_ncc() {
        return this.Ma_ncc;
    }

    public void setMa_ncc(String Ma_ncc) {
        this.Ma_ncc = Ma_ncc;
    }

    public String getTen_ncc() {
        return this.Ten_ncc;
    }

    public void setTen_ncc(String Ten_ncc) {
        this.Ten_ncc = Ten_ncc;
    }

    public String getSDT() {
        return this.SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiachi() {
        return this.Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public Nhacungcap Ma_ncc(String Ma_ncc) {
        setMa_ncc(Ma_ncc);
        return this;
    }

    public Nhacungcap Ten_ncc(String Ten_ncc) {
        setTen_ncc(Ten_ncc);
        return this;
    }

    public Nhacungcap SDT(String SDT) {
        setSDT(SDT);
        return this;
    }

    public Nhacungcap Diachi(String Diachi) {
        setDiachi(Diachi);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " Ma_ncc='" + getMa_ncc() + "'" +
            ", Ten_ncc='" + getTen_ncc() + "'" +
            ", SDT='" + getSDT() + "'" +
            ", Diachi='" + getDiachi() + "'" +
            "}";
    }
}
