/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author Yaale
 */
public abstract class  Persona {
    private int edad;
    private String domicilio;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    
     public Persona() {
    }

    public abstract void verInfo();
    

}
