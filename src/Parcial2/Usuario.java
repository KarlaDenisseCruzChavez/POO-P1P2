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
public class Usuario extends Persona{

      protected double salario;
      protected String usu;
      protected String contraseña;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  

    @Override
    public void verInfo() {
    }
    
}
