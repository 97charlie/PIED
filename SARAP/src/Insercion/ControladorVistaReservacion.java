/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

/**
 *
 * @author MS
 */
public class ControladorVistaReservacion {
    private vistaReservacion reservacionView;

    public ControladorVistaReservacion(vistaReservacion reservacionView) {
        this.reservacionView = reservacionView;
    }

    public vistaReservacion getReservacionView() {
        return reservacionView;
    }

    public void setReservacionView(vistaReservacion reservacionView) {
        this.reservacionView = reservacionView;
    }
    
    
    
}
