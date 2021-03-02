/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Yaale
 */
public class Main {
    //psvm
    public static void main(String[] args){
        //sout
       // System.out.println("Hola mundo");   
       
       //Creación del objeto, objeto es darle valores a la clase
    //Sintaxis creacion objeto: clase/modificadorAcc + nombreObj = new Clase();
    //int x; 
    //Celular objCel = new Celular();
     //x=123;
     //objCel.Llamar(x);
     //String res = objCel.ObtenerMarca();
        //System.out.println(res);
        
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        Scanner scn = new Scanner (System.in);    
        int[] agenda; //falta inicializar !!!  
        int tam;    
        System.out.println("De que tamaño quieres la agenda: ");
        tam = scn.nextInt();//capturamos el tamaño del arreglo
        agenda = new int[tam];//aquí se inicializa el arreglo con el tamaño definido para su posterior
//while/do while = iteracion indefinida
//for= iteración definida 
        for(int i=0; i<tam; i++){
            System.out.print("Dame un numero: " + (i+1));
            agenda[i]=scn.nextInt();
        }
    }
}
