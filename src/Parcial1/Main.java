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
public class Main {
    public static void main(String[] args) {
        
    //ES UNA PRUEBA NOMÁS PROFE 
    
    Perro perro = new Perro();
    Perro perro2 = new Perro();
    perro.setTamaño("Pequeño");
    perro.setRaza("Chihuahua");
    perro.setAlimentacion("Croquetas");
    
    perro2.setAlimentacion("Salchichas");
    
        System.out.println(perro.tamaño);
        System.out.println(perro.raza);
        System.out.println(perro.alimentacion);
        
        System.out.println(perro2.alimentacion);
        
        //Ejemplo interfaz
        perro.Comunicacion();
}
}