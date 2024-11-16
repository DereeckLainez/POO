/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241116;

/**
 *
 * @author deree
 */
public class Nintendo {
    private String Tamaño;
    private String Jugabilidad;

    public Nintendo(String Tamaño, String Jugabilidad) {
        this.Tamaño = Tamaño;
        this.Jugabilidad = Jugabilidad;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getJugabilidad() {
        return Jugabilidad;
    }

    public void setJugabilidad(String Jugabilidad) {
        this.Jugabilidad = Jugabilidad;
    }
    
}
