/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author asus
 */
public class Comprador extends Usuario {
    LinkedList<Pedido>pedidosPorRecibir();
    LinkedList<Venta>ventasRecibidas(); //compras
    LinkedList<Producto>productosDisponibles();
    double saldoDisponible;

    public Comprador(String Usuario, String contrasenia, String apellido, boolean tieneWhatsapp, String email, String direccion, String cedula, int matricula, boolean esVendedor, double saldo) {
        super(Usuario, contrasenia, apellido, tieneWhatsapp, email, direccion, cedula, matricula, esVendedor, saldo);
        this.saldoDisponible= saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    public LinkedList<Pedido> buscaPedidoPendiente(String nombre){
        return pedidosPorRecibir= new LinkedList<>();
    }
    
   
    
}
