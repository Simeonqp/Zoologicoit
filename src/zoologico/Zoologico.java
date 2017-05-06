/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import zoologico.entidades.Cuidador;

/**
 *
 * @author educacionit
 */
public class Zoologico {
    
    public Zoologico(){
        
    }
    private boolean abierto = false;
    public static final int CANTIDAD_ANIMALES = 25;
    public static final int RACIONES_POR_ANIMAL = 1;
    
    public void abrir(){
        this.abierto = true;
    }
    public void cerrar(){
        this.abierto = false;
    }
    public void alimentarAnimales(int cantidadRAciones){
        Cuidador cuidador = new Cuidador(cantidadRAciones);
        cuidador.alimentarAnimales();
    }
    public boolean isAbierto(){
        return abierto;
    }
    public void setAbierto(boolean abierto){
        this.abierto = abierto;
    }
    
    
}
