/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author deree
 */
public class Queco extends Animal {
    
    public Queco (String Pelo, String Boca, String Cola, String Ojo, Integer Pata){
        super (Pelo, Boca, Cola, Ojo, Pata);
    }
    @Override
    public void sonido(){
        System.out.println("El Queco Chilla");
}
