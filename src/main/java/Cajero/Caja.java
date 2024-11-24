/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author deree
 */
public class Caja {
    private String Banco;
    private String Targeta;

    public Caja(String Banco, String Targeta, String text2, String text3) {
        this.Banco = Banco;
        this.Targeta = Targeta;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getTargeta() {
        return Targeta;
    }

    public void setTargeta(String Targeta) {
        this.Targeta = Targeta;
    }
    
    
}
