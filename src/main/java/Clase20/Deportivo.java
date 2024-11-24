/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20;

/**
 *
 * @author deree
 */
public class Deportivo extends Carro {
    private String Velocidad;
    private String Estilo;

    public Deportivo(String Velocidad, String Estilo, String Color, String Marca) {
        super(Color, Marca);
        this.Velocidad = Velocidad;
        this.Estilo = Estilo;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }
    
    
}
