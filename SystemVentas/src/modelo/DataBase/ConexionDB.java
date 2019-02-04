/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author EVOTEC
 */
public class ConexionDB {

    //Declaración
    //private static DataBase baseDatos;
    //private static Connection conexion;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/proyectods?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String pass = "";
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {

                Class.forName(driver);
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Conectionesfull");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    

}
