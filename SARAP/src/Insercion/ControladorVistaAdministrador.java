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
public class ControladorVistaAdministrador {
    private vistaAdministrador adminView;

    public ControladorVistaAdministrador(vistaAdministrador adminView) {
        this.adminView = adminView;
    }

    public vistaAdministrador getAdminView() {
        return adminView;
    }

    public void setAdminView(vistaAdministrador adminView) {
        this.adminView = adminView;
    }
    
    
    
}
