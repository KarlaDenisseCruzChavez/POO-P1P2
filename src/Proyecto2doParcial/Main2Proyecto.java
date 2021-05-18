/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2doParcial;

import java.util.Scanner;

/**
 *
 * @author Yaale
 */
public class Main2Proyecto {
    public static void main(String[] args) {
         
                                                                                  //x1,x2,x3,x4,y1,y2,y3,y4
  Rectangulo rectangulo = new Rectangulo(-6,-6,-1,-1,-1,-4,-4,-1);
  Trapecio trapecio = new Trapecio(4,3,8,7,5,2,2,5);
  Cuadrado cuadrado = new Cuadrado(4,4,7,7,5,2,2,5);

    
    rectangulo.areaT();
    trapecio.areaT();
    cuadrado.areaT();
       
    }
}
