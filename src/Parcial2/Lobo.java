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
public class Lobo extends Canino {

    public String getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }
  private String subespecie;

    @Override
    public void setRaza(String raza) {
    }

    @Override
    public String getRaza() {
       return raza;
    }

    @Override
    public void setComplexion(String complexion) {
        
    }

    @Override
    public String getComplexion() {
       return complexion;
    }

    @Override
    public void setAlimentacion(String alimentacion) {
    }

    @Override
    public void setHabitat(String habitat) {
       
    }

    @Override
    public void setTipoPiel(String tipoPiel) {
        
    }

    @Override
    public String getAlimentacion() {
        return alimentacion;
    }

    @Override
    public String getHabitat() {
      return habitat;
    }

    @Override
    public String getTipoPiel() {
      return tipoPiel;
    }
    
@Override
    public void setClasificacion(String clasificación) {
        
    }
    
    @Override
    public String getClasificacion() {
       return clasificación;
    }

}
