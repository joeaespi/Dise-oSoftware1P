/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import modelo.Comprador;
import modelo.Producto;
import modelo.Vendedor;

/**
 *
 * @author alvaro-pc
 */
public class NotificacionComprador extends Notificar  implements Notificacion{

    @Override
    public void update() {
        System.out.println("Este producto ha sido comprado ");
    }

    @Override
    public void attach(Notificar notificar) {
        NotificacionComprador nc =(NotificacionComprador)notificar;
        Notificar.observardores.add(nc);
    }

    @Override
    public void dettach(Notificar notificar) {
        NotificacionComprador nc =(NotificacionComprador)notificar;
        Notificar.observardores.remove(nc);
    }

    @Override
    public void notificar() {
        for(int i = 0;i<Notificar.observardores.size();i++){
            Notificar.observardores.get(i).update();
        }
    }
}
