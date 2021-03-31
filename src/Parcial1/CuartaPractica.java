
package Parcial1;
import java.util.Scanner;

public class CuartaPractica {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        double num[];
        double sumaNums=0;
        double prom;
        num = new double[10];
        System.out.println("PROMEDIO DE 10 NÚMEROS");
        System.out.println("-------------------------------------------");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dime el número " + (i+1) + ": ");
            num[i]= scn.nextDouble();
        }
        System.out.println("El arreglo original es: ");
        for (int i = 0; i < num.length; i++) {
             sumaNums+=num[i];  
             System.out.println(num[i]);
             
                     
        }
        
       prom = sumaNums / 10;
        System.out.println("El promedio de los 10 números es: " + prom);
        
        
    }
}
