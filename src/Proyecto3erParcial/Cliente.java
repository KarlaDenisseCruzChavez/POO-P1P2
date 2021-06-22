/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3erParcial;

/**
 *
 * @author Yaale
 */
public class Cliente {
    private String idCliente, nombre, edad, correo, numero;
   

    public Cliente(String idCliente, String nombre, String edad, String correo, String numero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.numero = numero;
    }

   

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
            }