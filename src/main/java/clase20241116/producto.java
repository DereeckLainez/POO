/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clase20241116;

/**
 *
 * @author deree
 */
public class producto {
    private String Color;
    private String Almacenamiento;
    private String Ram;

    public  producto(String Color, String Almacenamiento, String Ram) {
        this.Color=Color;
        this.Almacenamiento=Almacenamiento;
        this.Ram=Ram;
    }
    
    public String getColor(){
        return Color;
    }
    
    public void setColor(String Color){
        this.Color=Color;
    }
    
     public String getAlmacenamiento(){
        return Almacenamiento;
    }
    
    public void setAlmacenamiento(String Almacenamiento){
        this.Almacenamiento=Almacenamiento;
    }
   
    public String getRam(){
        return Ram;
    }
    
    public void setRam(String Ram){
        this.Ram=Ram;
    }
}
