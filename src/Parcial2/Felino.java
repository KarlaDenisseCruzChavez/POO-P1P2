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
public abstract class Felino  extends Animal{
    protected double tamaño;
    protected double peso;

    public abstract void setTamaño(double tamaño);
 
    public abstract double getTamaño();
    
    public abstract void setPeso(double peso);
 
    public abstract double getPeso();

    @Override
    public abstract String getTipoPiel();

    @Override
    public abstract String getHabitat();

    @Override
    public abstract String getAlimentacion();

    @Override
    public abstract void setTipoPiel(String tipoPiel);

    @Override
    public abstract void setHabitat(String habitat);

    @Override
    public abstract void setAlimentacion(String alimentacion);
    
    
    
    
}
