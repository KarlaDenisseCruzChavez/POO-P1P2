
package Parcial1;
import java.util.Scanner;

public class SegundaPractica {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n;
        System.out.println("Cuántas líneas quieres: ");
        n = scn.nextInt();
        for (int i = 1; i <=n; i++) { 
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(i*2)-1; k++) {
                System.out.print("o");
            }
        System.out.println();
        }
    }
}

