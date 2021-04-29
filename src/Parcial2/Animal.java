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
public abstract class Animal {
    protected String alimentacion;
    protected String habitat;
    protected String tipoPiel;

public abstract void setAlimentacion (String alimentacion);
public abstract void setHabitat(String habitat); 
public abstract void setTipoPiel(String tipoPiel);


public abstract String getAlimentacion();
public abstract String getHabitat();
public abstract String getTipoPiel();

}
