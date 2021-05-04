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
public class MainC {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        Cliente cliente = new Cliente();
        
        cliente.setNoSocio(23455);
        System.out.println("El numero de socio es " + cliente.noSocio);
        
        
        cliente.pedirPrestamo(); 
        
        System.out.println("---------------------------------------------------------");
        admin.estarEnSucursal();
    }
}
