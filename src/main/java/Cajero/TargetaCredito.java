/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author deree
 */
public class TargetaCredito extends Caja {
    private String MarcaTargeta;
    private String Pin;

    public TargetaCredito(String MarcaTargeta, String Pin, String Banco, String Targeta, String text2, String text3) {
        super(Banco, Targeta, text2, text3);
        this.MarcaTargeta = MarcaTargeta;
        this.Pin = Pin;
    }

    public String getMarcaTargeta() {
        return MarcaTargeta;
    }

    public void setMarcaTargeta(String MarcaTargeta) {
        this.MarcaTargeta = MarcaTargeta;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

}
