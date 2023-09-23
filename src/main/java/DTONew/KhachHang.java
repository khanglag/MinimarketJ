/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String Ma_kh;
    private String Ten_kh;
    private String NgaySinh;
    private String sdt;
    private String Cccd;
    private boolean TonTai;
    
    public KhachHang(){
        
    }

    public KhachHang(String Ma_kh, String Ten_kh, String NgaySinh, String sdt, String Cccd, boolean TonTai) {
        this.Ma_kh = Ma_kh;
        this.Ten_kh = Ten_kh;
        this.NgaySinh = NgaySinh;
        this.sdt = sdt;
        this.Cccd = Cccd;
        this.TonTai = TonTai;
    }

    public String getMa_kh() {
        return Ma_kh;
    }

    public void setMa_kh(String Ma_kh) {
        this.Ma_kh = Ma_kh;
    }

    public String getTen_kh() {
        return Ten_kh;
    }

    public void setTen_kh(String Ten_kh) {
        this.Ten_kh = Ten_kh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public boolean isTonTai() {
        return TonTai;
    }

    public void setTonTai(boolean TonTai) {
        this.TonTai = TonTai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "Ma_kh=" + Ma_kh + ", Ten_kh=" + Ten_kh + ", NgaySinh=" + NgaySinh + ", sdt=" + sdt + ", Cccd=" + Cccd + ", TonTai=" + TonTai + '}';
    }
    
    
    

}  