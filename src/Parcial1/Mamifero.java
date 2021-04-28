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
public abstract class Mamifero extends Animal{
    protected String clasificación;

   public abstract void setClasificacion(String clasificación);
 
    public abstract String getClasificacion();

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
