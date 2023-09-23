/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTONew;

/**
 *
 * @author Admin
 */
public class PhieuXuat {
    private String ma_phieuXuat;
    private String ma_nv;
    private String ma_kh;
    private String lyDo;
    private String ghiChu;

    public PhieuXuat() {
    }

    public PhieuXuat(String ma_phieuXuat, String ma_nv, String ma_kh, String lyDo, String ghiChu) {
        this.ma_phieuXuat = ma_phieuXuat;
        this.ma_nv = ma_nv;
        this.ma_kh = ma_kh;
        this.lyDo = lyDo;
        this.ghiChu = ghiChu;
    }

    public String getMa_phieuXuat() {
        return ma_phieuXuat;
    }

    public void setMa_phieuXuat(String ma_phieuXuat) {
        this.ma_phieuXuat = ma_phieuXuat;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getMa_kh() {
        return ma_kh;
    }

    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "PhieuXuat{" + "ma_phieuXuat=" + ma_phieuXuat + ", ma_nv=" + ma_nv + ", ma_kh=" + ma_kh + ", lyDo=" + lyDo + ", ghiChu=" + ghiChu + '}';
    }
    
    
    
}
