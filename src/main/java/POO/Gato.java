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

    public Gato(String Pelo, String Boca, String Cola, String Ojo, Integer Patas) {
        super(Pelo, Boca, Cola, Ojo, Patas);
    }
    
    public void Sonido(){
        System.out.println("EL Gato Maulla");
    }
}