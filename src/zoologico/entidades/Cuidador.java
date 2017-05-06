/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;
import zoologico.Zoologico;
import zoologico.entidades.Persona;

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona{
    private int cantidadDeRaciones;
    
    public Cuidador(String nombre, String fechaDeNacimiento, int cantidadDeRaciones){
        //super(nombre, fechaDeNacimiento);
    }
    public Cuidador(int unaCantidad){
        this.cantidadDeRaciones = unaCantidad;
    }
    public void alimentarAnimales(){
        Cuidador c = new Cuidador("Juan","1976",5);
        c.getFechaDeNacimiento();
        System.out.println(c.cantidadDeRaciones);
        int cantidadNecesaria = Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMAL;
        int sobranFaltante = cantidadDeRaciones - cantidadNecesaria;
        String mensaje = "";
        if(Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMAL <= cantidadDeRaciones)
            System.out.println("OK");
        else
            System.out.println("Not OK");
        
        if(sobranFaltante == 0){
            mensaje = "La comida alcanzo justo. No sobro nada";
        }
        if(sobranFaltante > 0){
            mensaje = "La comida alcanzo y sobro";
        }
        if(sobranFaltante < 0){
            mensaje = "La comida NO alcanzo!";
        }
        System.out.println(mensaje);
    }
    public int getCantidaDeRaciones(){
        return cantidadDeRaciones;
    }
    public void setCantidadDeRaciones(int cantidadDeRaciones){
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
}
