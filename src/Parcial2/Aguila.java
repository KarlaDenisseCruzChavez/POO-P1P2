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
public class Aguila extends Ave implements ComportamientoAnimal{
    
  public void comunicacion(){
  System.out.println("Grita como aguila");
  }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
    private String plumaje;

    @Override
    public void setPico(String pico) {
       
    }

    @Override
    public String getPico() {
        return pico; 
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

    @Override
    public void Comunicacion() {
        
    }

    

    
   
}
