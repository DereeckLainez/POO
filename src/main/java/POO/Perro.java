/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author deree
 */

public class Perro extends Animal {

public Perro (String Pelo, String Boca, String Cola, String Ojo, Integer Pata) {
  super(Pelo, Boca, Cola, Ojo, Pata);  
  
}
    @Override
    public void sonido(){
        System.out.println("El perro ladra");
}
}