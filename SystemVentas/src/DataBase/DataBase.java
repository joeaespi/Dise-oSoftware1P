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
    public static Connection getConnection() {
        Connection con = null;
        //192.168.1.12  
       // String url = "jdbc:mysql://localhost:3306/proyectods";
        String url = "jdbc:mysql://192.168.1.12:3306/proyectods";
        String user = "root";
        String pass = "jaed";
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
       getConnection();
        
    }
}
