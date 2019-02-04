/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author EVOTEC
 */
public abstract class Notificar implements Subject, Notificacion {
    protected static ArrayList<Notificar> observardores =  new ArrayList<>();
    public abstract void attach(Notificar notificar);

    public abstract void dettach(Notificar notificar);

    public abstract void notificar();
    
    public abstract void update();
    
}
