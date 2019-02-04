/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author asus
 */
public class Pedido {
    LinkedList<Producto> productos;
    Vendedor vendedor;
    Date fechaPedido;
    double costoTotal;
    void cancelar(){
        
    }
    void finalizarCompra(){
        
    }
}
