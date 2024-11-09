/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author deree
 */
public class Herencia {

    public static void main(String[] args) {
        Animal p= new Perro ("Color Negro","Si","Si","Si", 4);
        p.Sonido();
   
        Animal g= new Gato ("Blanco","Si","Si","Si", 4):
        g.Sonido();
    }
    @Override
    public void sonido(){
        System.out.println("El perro ladra");
    }
}