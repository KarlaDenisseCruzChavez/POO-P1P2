/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

/**
 *
 * @author Yaale
 */
//Upper camel case
public class Celular {
    //atributos
    //Sintaxis para crear variables
        //Lower camel case
        //modificador de acceso + tipoRetorno + nombreVariable
        //void -> vacio
        //moAcceso + tipoRetorno + nombre(Parametros)
        //parametros-> variables locales(tipoDato + nombreParametro)
    
    //variables globales
    private String marca;
    private String capacidadMaxima;
    private String tamaño;
    private String color;
    private double costo;
    private String modelo;
    private boolean chino;
        
        //metodos
        //metodo especial (constructor)
 public Celular(){
 
 }

public void Llamar(int numero){
        //variable local 
        //contexto recudico
        System.out.println("Marcando al numero: " + numero + "...");
    }
public String ObtenerMarca(){
return marca;
}

}