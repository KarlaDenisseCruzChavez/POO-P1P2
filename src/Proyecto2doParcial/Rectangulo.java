/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2doParcial;

/**
 *
 * @author Yaale
 */
public class Rectangulo extends Cuadrilatero {
    private double areaR;
    
    public Rectangulo(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    public Rectangulo() {
    }

    public double getAreaR() {
        return areaR;
    }

    public void setAreaR(double areaR) {
        this.areaR = areaR;
    }

   
    @Override
    public void areaT() {
      areaR = Math.abs(((x1*y2)+(x2*y3)+(x3*y4)+(x4*y1))-((x1*y4)+(x4*y3)+(x3*y2)+(x2*y1)))/2;
        System.out.println("El area del rectangulo es: " + areaR);
        return;
    }

    

   

   

    

    
}
