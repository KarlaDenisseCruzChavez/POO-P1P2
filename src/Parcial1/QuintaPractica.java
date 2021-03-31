
package Parcial1;
import java.util.Scanner;

public class QuintaPractica {
    public static void main(String[] args) {
        
        int pos = -1;
        
        Scanner scn = new Scanner(System.in);
        
        int nums[];
        
        nums = new int[10];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el número " + (i+1)+": ");
            nums[i]=scn.nextInt(); 
        }
        
        System.out.println("Ingrese el número a buscar: ");
        int n = scn.nextInt();
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==n){
                pos = i;
            }
        }
        if(pos==-1){
            System.out.println("La posición no se encontró");
            System.out.println("La posición del número es: " + pos);
        
        }
        else{
            System.out.println("La posición del número " + n + " es: " + pos);
        }
    } 
}
