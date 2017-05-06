/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public abstract class Persona {
    public Persona(){
    }
    private String nombre;
    private Date fechaNacimiento;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Date getFechaDeNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaNacimiento = fechaDeNacimiento;
    }
}
