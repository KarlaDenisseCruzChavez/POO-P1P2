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
public abstract class Ave extends Oviparo{
    protected String pico;

    public abstract void setPico(String pico);
 
    public abstract String getPico();
    
    @Override
    public void setNumPatas(int numPatas) {
    }

    @Override
    public int getNumPatas() {
        return numPatas;
    }

    @Override
    public String getTipoPiel() {
       return tipoPiel;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String getAlimentacion() {
        return alimentacion;
    }

    @Override
    public void setTipoPiel(String tipoPiel) {
        
    }

    @Override
    public void setHabitat(String habitat) {
     
    }

    @Override
    public void setAlimentacion(String alimentacion) {
    }

    
}
