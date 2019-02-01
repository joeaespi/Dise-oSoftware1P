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
public class Producto {
    String nombre;
    String categoria;
    double precio;
    double tiempoMaxEntrega;
    LinkedList<Vendedor>vendedoresDispo;
    //LinkedList<calificaciones>calificacionesr;
}
