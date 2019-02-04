/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Component;
import java.sql.Connection;
import javax.swing.JTextField;
import login.signUp;
import modelo.Usuario;

/**
 *
 * @author asus
 */
public class Main {
    Validaciones v;
    signUp registro;
    Connection cn;

    private void presentarInterfaz() {
        
    }

    private void guardarNuevoUsuario(Usuario user) {
        
    }

    private void validarTexto() {

        Component[] c = registro.jpregistro.getComponents();/*obtengo los componentes*/
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof JTextField) {
                /*si es un textfield*/
                JTextField tf = (JTextField) c[i];
                /*casteo*/
                //tf.setEnabled(true);
                if(v.emptyField(tf.getText())){
                   //guardarNuevoUsuario();
                }
                
                /*habilito el control*/
            }
        }
    }
   

}
