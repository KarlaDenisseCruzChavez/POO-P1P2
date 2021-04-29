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
public class Salmon extends Pez{
    private boolean silvestre;
    
    public boolean isSilvestre() {
        return silvestre;
    }

    public void setSilvestre(boolean silvestre) {
        this.silvestre = silvestre;
    }


    @Override
    public void setClasificacionPez(String clasificaciónPez) {
        
    }

    @Override
    public String getClasificacionPez() {
       return clasificacionPez;
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        super.setAlimentacion(alimentacion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHabitat(String habitat) {
        super.setHabitat(habitat); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoPiel(String tipoPiel) {
        super.setTipoPiel(tipoPiel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlimentacion() {
        return super.getAlimentacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHabitat() {
        return super.getHabitat(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoPiel() {
        return super.getTipoPiel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumPatas() {
        return super.getNumPatas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumPatas(int numPatas) {
        super.setNumPatas(numPatas); //To change body of generated methods, choose Tools | Templates.
    }

    
}
