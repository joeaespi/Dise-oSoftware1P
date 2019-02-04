/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EVOTEC
 */
public class DataBase {

    //Declaración
    private static DataBase baseDatos;
    Connection con;
    String url = "jdbc:mysql://localhost/proyectods?autoReconnect=true&useSSL=false";
    String user = "root";
    String pass = "";
    //private static Conexion instancia = new Conexion();

    //Para evitar instancia mediante operador "new"
    private DataBase() {

    }

    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static DataBase getConexion() {
        if (baseDatos == null) {
            baseDatos = new DataBase();
        }
        return baseDatos;
    }

    //Método de prueba
    public Connection conectar() {
        //System.out.println("Me conecté a la BD");
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Antes de conetar");
            con = DriverManager.getConnection(url, user, pass);
            if(con!=null){
            System.out.println("conectado");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println("No se puedo conectar");
            return null;
        }
        return con;
    }
    
    //Método de prueba
    public void desconectar() {
        con=null; //ver
        System.out.println("Me desconecté de la BD");
    }
    /*public static Connection getConnection() {
        /*Connection con = null;
        //192.168.1.12  
       // String url = "jdbc:mysql://localhost:3306/proyectods";
        String url = "jdbc:mysql://localhost/proyectods?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Antes de conetar");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("conectado");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println("No se puedo conectar");
            return null;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       getConnection();*/

}
