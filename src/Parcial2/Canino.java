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
public abstract class Canino extends Mamifero{
    protected String raza;
    protected String complexion;

   public abstract void setRaza(String raza);
 
    public abstract String getRaza();
    
    public abstract void setComplexion(String complexion);
 
    public abstract String getComplexion();

    @Override
    public abstract void setAlimentacion(String alimentacion);

    @Override
    public abstract void setHabitat(String habitat);

    @Override
    public abstract void setTipoPiel(String tipoPiel);

    @Override
    public abstract String getAlimentacion();

    @Override
    public abstract String getHabitat();

    @Override
    public abstract String getTipoPiel();

    @Override
    public abstract String getClasificacion();

    @Override
    public abstract void setClasificacion(String clasificación);
    
    

}
