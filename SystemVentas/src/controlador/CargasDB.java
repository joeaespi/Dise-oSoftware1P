/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DataBase.DataBase;

/**
 *
 * @author asus
 */
public class CargasDB {

    public void conectar() {
        DataBase c = DataBase.getConexion();
        c.conectar();
        c.desconectar();
        
    }

}
