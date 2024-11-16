/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241116;

/**
 *
 * @author deree
 */
public class XboxOne extends producto {
    private String Rendimiento;
    private String Catalogo;

    public XboxOne(String Rendimiento, String Catalogo, String Color, String Almacenamiento, String Ram) {
        super(Color, Almacenamiento, Ram);
        this.Rendimiento = Rendimiento;
        this.Catalogo = Catalogo;
    }

    public String getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(String Rendimiento) {
        this.Rendimiento = Rendimiento;
    }

    public String getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(String Catalogo) {
        this.Catalogo = Catalogo;
    }
    
    }
