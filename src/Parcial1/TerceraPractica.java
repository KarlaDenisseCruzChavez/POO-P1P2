package Parcial1;
import java.util.Scanner;

public class TerceraPractica {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int [] nums;
        int tam;
        int aux;
        System.out.print("Números a introducir: ");
        tam = scn.nextInt();
        nums = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Dame el número " + (i+1)+ " : ");
            nums[i]= scn.nextInt();
            
            for (int j = 0; j < tam; j++) {
                if(nums[i] < nums[j]){
                aux = nums[i];
                nums[i] = nums[j];
                nums[j] = aux;
                }
            } 
        }
        System.out.print("Los numeros de menor a mayor son: ");
        
        for (int i = 0; i < tam; i++) {
            System.out.print(nums[i] + ", "); 
        }
    }
}
