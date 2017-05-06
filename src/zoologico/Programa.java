/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author educacionit
 */
public class Programa {
    public Programa(){
                       
    }
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.abrir();
        
        zoo.alimentarAnimales(5);
        
        zoo.cerrar();
        
    }
}
