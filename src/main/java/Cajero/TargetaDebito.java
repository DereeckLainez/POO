/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author deree
 */
public class TargetaDebito {
    private String BancoTargeta;
    private String Retiro;

    public TargetaDebito(String BancoTargeta, String Retiro) {
        this.BancoTargeta = BancoTargeta;
        this.Retiro = Retiro;
    }

    public String getBancoTargeta() {
        return BancoTargeta;
    }

    public void setBancoTargeta(String BancoTargeta) {
        this.BancoTargeta = BancoTargeta;
    }

    public String getRetiro() {
        return Retiro;
    }

    public void setRetiro(String Retiro) {
        this.Retiro = Retiro;
    }

}