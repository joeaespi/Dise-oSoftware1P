/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Validaciones {
    static String regex;
    /*uso de expresiones regulares*/
    
    public static boolean validaTelefono(String cell){
        return Pattern.matches("[0-9]{10}", cell);
    }
    public static boolean validacedula(String CI){
        return Pattern.matches("[0-9]{10}", CI);
    }
    
    public static boolean emptyField(String field){
        return field.equals("");
    }
    public static boolean validaMatricula(String matricula){
        return Pattern.matches("[0-9]{9}", matricula);
    }
    public static boolean validaEmail(String email){
        return Pattern.matches("[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}", email);
    }
     public static boolean validaBusqueda(String palabra,String cadena){
            Pattern regex1 = Pattern.compile("\\b" + Pattern.quote(palabra) + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher match = regex1.matcher(cadena);
            return match.find();
    }
}
