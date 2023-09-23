/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTONew;

/**
 *
 * @author Admin
 */
public class NhomHang {
    private String ma_nh;
    private String Ten_nh;
    private boolean tonTai;

    public NhomHang() {
    }

    public NhomHang(String ma_nh, String Ten_nh, boolean tonTai) {
        this.ma_nh = ma_nh;
        this.Ten_nh = Ten_nh;
        this.tonTai = tonTai;
    }

    public String getMa_nh() {
        return ma_nh;
    }

    public void setMa_nh(String ma_nh) {
        this.ma_nh = ma_nh;
    }

    public String getTen_nh() {
        return Ten_nh;
    }

    public void setTen_nh(String Ten_nh) {
        this.Ten_nh = Ten_nh;
    }

    public boolean isTonTai() {
        return tonTai;
    }

    public void setTonTai(boolean tonTai) {
        this.tonTai = tonTai;
    }

    @Override
    public String toString() {
        return "NhomHang{" + "ma_nh=" + ma_nh + ", Ten_nh=" + Ten_nh + ", tonTai=" + tonTai + '}';
    }
    
    
    
    
}
