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
public abstract class Pez extends Oviparo{
    protected String clasificacionPez;

   public abstract void setClasificacionPez(String clasificaciónPez);
 
    public abstract String getClasificacionPez();


    @Override
    public void setNumPatas(int numPatas) {
        this.numPatas=numPatas;
    }

    @Override
    public int  getNumPatas() {
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
        this.tipoPiel= tipoPiel;
    }

    @Override
    public void setHabitat(String habitat) {
       this.habitat=habitat;
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        this.alimentacion=alimentacion;
                }

    
    
}
