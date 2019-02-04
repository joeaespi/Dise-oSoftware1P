/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author asus
 */
public class Vendedor extends Usuario {
    
    public Vendedor(String Usuario, String contrasenia, String nombre, String apellido, boolean tieneWhatsapp, String email, String direccion, String cedula, int matricula, boolean esVendedor, double saldo) {
        super(Usuario, contrasenia, nombre, apellido, tieneWhatsapp, email, direccion, cedula, matricula, esVendedor, saldo);
    }
    
    
    
}
