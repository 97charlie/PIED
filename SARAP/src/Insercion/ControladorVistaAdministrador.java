/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author MS
 */
public class ControladorVistaAdministrador {

    private vistaAdministrador adminView;

    public ControladorVistaAdministrador() {
        iniciarVista();
    }

    public vistaAdministrador getAdminView() {
        return adminView;
    }

    public void setAdminView(vistaAdministrador adminView) {
        this.adminView = adminView;
    }

    public void iniciarVista() {
        setAdminView(new vistaAdministrador());
        getAdminView().setVisible(true);
        iniciarActionListeners();
    }

    public void iniciarActionListeners() {

        getAdminView().AgregarBusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });

        getAdminView().EliminarBusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        getAdminView().LimpiarBusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getAdminView().idBusTextField.setText("");
                getAdminView().MarcaTextField.setText("");
                getAdminView().AsientosTextField.setText("");
                getAdminView().ModeloTextField.setText("");
            }
        });

    }

    public void agregarBus(int idBus, int asientos, String marca, String modelo) {
        Autobus auxBus = new Autobus(idBus, asientos, marca, modelo);

    }

}
