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
public class Perro extends Canino{
protected  String tamaño;
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    

    @Override
    public void setRaza(String raza) {
       this.raza= raza;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public void setComplexion(String complexion) {
       this.complexion = complexion;
    }

    @Override
    public String getComplexion() {
        return complexion;
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        this.alimentacion=alimentacion;
    }

    @Override
    public void setHabitat(String habitat) {
      this.habitat=habitat;
    }

    @Override
    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel=tipoPiel;
    }

    @Override
    public String getAlimentacion() {
        return alimentacion;
    }

    @Override
    public String getHabitat() {
       return habitat
               ;
    }

    @Override
    public String getTipoPiel() {
        return tipoPiel;
    }

    @Override
    public String getClasificacion() {
        return clasificación;
    }

    @Override
    public void setClasificacion(String clasificación) {
     this.clasificación=clasificación;
    }

    

}
