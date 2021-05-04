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
public class Cliente extends Persona implements InterfazCliente, InterfazPersona{
        protected int noSocio;
       

    public int getNoSocio() {
        return noSocio;
    }

    public void setNoSocio(int noSocio) {
        this.noSocio = noSocio;
    }

    @Override
    public void verInfo() {
        
    }

    @Override
    public void ahorrar() {
            }

    @Override
    public void pedirPrestamo() {
        System.out.println("El cliente a pedido un prestamo de $50000");
    }

    @Override
    public void comprar() {
    }

    @Override
    public void pagarServicios() {
        
    }      

    @Override
    public void hablar() {
       
    }

    @Override
    public void estarEnSucursal() {
        
    }

    @Override
    public void descansar() {
       
    }

    @Override
    public void firmar() {
       
    }
}
