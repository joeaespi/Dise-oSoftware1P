/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DataBase;

import static DataBase.ConexionDB.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author asus
 */
public class CargasDB {
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConnection();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }  
  
    
}
