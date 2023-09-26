/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class AnhSP {
    private String ma_sp;
    private String link_anh;

    public AnhSP() {
    }

    public AnhSP(String ma_sp, String link_anh) {
        this.ma_sp = ma_sp;
        this.link_anh = link_anh;
    }

    public String getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(String ma_sp) {
        this.ma_sp = ma_sp;
    }

    public String getLink_anh() {
        return link_anh;
    }

    public void setLink_anh(String link_anh) {
        this.link_anh = link_anh;
    }

    @Override
    public String toString() {
        return "AnhSP{" + "ma_sp=" + ma_sp + ", link_anh=" + link_anh + '}';
    }
    
    
    
    
}
