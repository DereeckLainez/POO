/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author deree
 */
public class Gato extends Animal {
    
    public Gato(String pelo, String Boca, String Cola, String Ojo, Integer Pata) {
        super(Pelo, Boca, Cola, Ojo, Pata);
      
    }
    
    public void Sonido (){
        System.out.println("El gato maulla");
    }
    @Override
    public void sonido(){
        System.out.println("El gato maulla");
    
}
