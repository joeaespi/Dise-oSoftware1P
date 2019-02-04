/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DataBase.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Consultas {
    ConexionDB conexion;
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS;
    
    Consultas(){
        PS = null;
        conexion = new ConexionDB();
        //conexion = DataBase.getConexion();
    }
    public void nuevosProductos() {

    }

    public void masPopulares() {

    }

    private DefaultTableModel setTitulos() {
        DT = new DefaultTableModel();
        DT.addColumn("nombre");
        DT.addColumn("categoria");
        DT.addColumn("descripcion");
        DT.addColumn("precio");
        DT.addColumn("tiempoMaximoEntrega");
        DT.addColumn("calificacionPromedio");
        DT.addColumn("porcentajeBusqueda");
        return DT;
 
    }/*
    public DefaultTableModel getDatos() {
        System.out.println("Estoy");
        String SQL_SELECT = "SELECT * FROM producto";
        try {

            setTitulos();
            PS = conexion.getConexion().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[7];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getFloat(4);
                fila[4] = RS.getFloat(5);
                fila[5] = RS.getFloat(6);
                fila[6] = RS.getFloat(7);
                

                DT.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            PS = null;
            RS = null;
            conexion.desconectar();
        }
        return DT;
    }/*
    public static ResultSet getTabla(String consulta){
        Connection cn= conexion.getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st= cn.createStatement();
            datos=st.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
            
        }
    */
    
}
