/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author deree
 */
public class Animal {
    private String Pelo;
    private String Boca;
    private String Cola;
    private String Ojo;
    private Integer Pata;

    public Animal(String Pelo, String Boca, String Cola, String Ojo, Integer Pata) {
        this.Pelo = Pelo;
        this.Boca = Boca;
        this.Cola = Cola;
        this.Ojo = Ojo;
        this.Pata = Pata;
    }

    public String getPelo() {
        return Pelo;
    }

    public void setPelo(String Pelo) {
        this.Pelo = Pelo;
    }

    public String getBoca() {
        return Boca;
    }

    public void setBoca(String Boca) {
        this.Boca = Boca;
    }

    public String getCola() {
        return Cola;
    }

    public void setCola(String Cola) {
        this.Cola = Cola;
    }

    public String getOjo() {
        return Ojo;
    }

    public void setOjo(String Ojo) {
        this.Ojo = Ojo;
    }

    public Integer getPata() {
        return Pata;
    }

    public void setPata(Integer Pata) {
        this.Pata = Pata;
    }

    void Sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}