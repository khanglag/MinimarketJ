/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author beo
 */
public class Phanquyen {
    private String Ma_pq;
    private String Tenquyen;
      public Phanquyen() {
    }

    public Phanquyen(String Ma_pq, String Tenquyen) {
        this.Ma_pq = Ma_pq;
        this.Tenquyen = Tenquyen;
    }

    public String getMa_pq() {
        return this.Ma_pq;
    }

    public void setMa_pq(String Ma_pq) {
        this.Ma_pq = Ma_pq;
    }

    public String getTenquyen() {
        return this.Tenquyen;
    }

    public void setTenquyen(String Tenquyen) {
        this.Tenquyen = Tenquyen;
    }

    public Phanquyen Ma_pq(String Ma_pq) {
        setMa_pq(Ma_pq);
        return this;
    }

    public Phanquyen Tenquyen(String Tenquyen) {
        setTenquyen(Tenquyen);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " Ma_pq='" + getMa_pq() + "'" +
            ", Tenquyen='" + getTenquyen() + "'" +
         "}";
    
}
}