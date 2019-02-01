/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author asus
 */
public class FormaPago {
    private pagoStrategy strategy;
    
    public FormaPago() {        
    }
    
    public void pagar(String modo, float monto){
        if(modo.equals("EFECTIVO")){
            strategy = new PagoEfectivo();
        }else if(modo.equals("APP")){
            strategy = new PagoApp();
        }
        strategy.pagar(monto);
    }
}
