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
        getAdminView().CerrarSesionButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getAdminView().setVisible(false);
                new ControladorLogin();
                getAdminView().dispose();
            }
        });
        getAdminView().AgregarBusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Tomar los datos de los textfield
                String idBus = getAdminView().idBusTextField.getText();
                String marca = getAdminView().MarcaTextField.getText();
                String asientos = getAdminView().AsientosTextField.getText();
                String modelo = getAdminView().ModeloTextField.getText();

                //Agregarlos al archivo
                CsvManager manejador = new CsvManager("Autobus.txt");
                manejador.agregarLineaAlFinal(idBus + "," + marca + "," + asientos + "," + modelo);
            }
        });

        getAdminView().EliminarBusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String idBus = getAdminView().idBusTextField.getText();
                String marca = getAdminView().MarcaTextField.getText();
                String asientos = getAdminView().AsientosTextField.getText();
                String modelo = getAdminView().ModeloTextField.getText();

                CsvManager manejador = new CsvManager("Autobus.txt");
                manejador.eliminarLineaDelArchivo(idBus + "," + marca + "," + asientos + "," + modelo);
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

        getAdminView().AgregarChoferButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String numEmpleado = getAdminView().NumEmpleadoTextField.getText();
                String nombre = getAdminView().NombreTextField.getText();
                String diaNac = getAdminView().diaNacimientoTextField.getText();
                String mesNac = getAdminView().mesNacimientoTextField.getText();
                String aniNac = getAdminView().anioNacimientoTextField.getText();

                CsvManager manejador = new CsvManager("Chofer.txt");
                manejador.agregarLineaAlFinal(numEmpleado + "," + nombre + "," + diaNac + "," + mesNac + "," + aniNac);
            }
        });

        getAdminView().EliminarChoferButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String numEmpleado = getAdminView().NumEmpleadoTextField.getText();
                String nombre = getAdminView().NombreTextField.getText();
                String diaNac = getAdminView().diaNacimientoTextField.getText();
                String mesNac = getAdminView().mesNacimientoTextField.getText();
                String aniNac = getAdminView().anioNacimientoTextField.getText();

                CsvManager manejador = new CsvManager("Chofer.txt");
                manejador.eliminarLineaDelArchivo(numEmpleado + "," + nombre + "," + diaNac + "," + mesNac + "," + aniNac);
            }
        });

        getAdminView().LimpiarChoferButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getAdminView().NumEmpleadoTextField.setText("");
                getAdminView().NombreTextField.setText("");
                getAdminView().diaNacimientoTextField.setText("");
                getAdminView().mesNacimientoTextField.setText("");
                getAdminView().anioNacimientoTextField.setText("");
            }
        });

        getAdminView().AgregarRutaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String idruta = getAdminView().idRutaTextFieldRuta.getText();
                String origen = getAdminView().origenTextField.getText();
                String destino = getAdminView().destinoTextField.getText();
                String intermedios = getAdminView().intermediosTextField.getText();

                CsvManager manejador = new CsvManager("Ruta.txt");
                manejador.agregarLineaAlFinal(idruta + "," + origen + "," + destino + "," + intermedios);
            }
        });

        getAdminView().EliminarRutaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String idruta = getAdminView().idRutaTextFieldRuta.getText();
                String origen = getAdminView().origenTextField.getText();
                String destino = getAdminView().destinoTextField.getText();
                String intermedios = getAdminView().intermediosTextField.getText();

                CsvManager manejador = new CsvManager("Ruta.txt");
                manejador.eliminarLineaDelArchivo(idruta + "," + origen + "," + destino + "," + intermedios);
            }
        });

        getAdminView().LimpiarRutaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getAdminView().idRutaTextFieldRuta.setText("");
                getAdminView().origenTextField.setText("");
                getAdminView().destinoTextField.setText("");
                getAdminView().intermediosTextField.setText("");
            }
        });

        getAdminView().AgregarViajeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String idRuta = getAdminView().idRutaTextFieldViaje.getText();
                String idBus = getAdminView().idBusTextFieldViaje.getText();
                String dia = getAdminView().DiaViajeTextField.getText();
                String mes = getAdminView().mesViajeTextField.getText();
                String anio = getAdminView().anioViajeTextField.getText();
                String horas = getAdminView().horaTextField.getText();
                String minutos = getAdminView().minutoTextField.getText();
                String dHora = getAdminView().horaDuraTextField.getText();
                String dMins = getAdminView().minutosDuraTextField.getText();
                String precio = getAdminView().precioTextField.getText();

                CsvManager manejador = new CsvManager("Viaje.txt");
                manejador.agregarLineaAlFinal(idRuta + "," + idBus + "," + dia + "," + mes + "," + anio + "," + horas + "," + minutos + "," + dHora + "," + dMins + "," + precio);
            }
        });

        getAdminView().EliminarViajeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String idRuta = getAdminView().idRutaTextFieldViaje.getText();
                String idBus = getAdminView().idBusTextFieldViaje.getText();
                String dia = getAdminView().DiaViajeTextField.getText();
                String mes = getAdminView().mesViajeTextField.getText();
                String anio = getAdminView().anioViajeTextField.getText();
                String horas = getAdminView().horaTextField.getText();
                String minutos = getAdminView().minutoTextField.getText();
                String dHora = getAdminView().horaDuraTextField.getText();
                String dMins = getAdminView().minutosDuraTextField.getText();
                String precio = getAdminView().precioTextField.getText();

                CsvManager manejador = new CsvManager("Viaje.txt");
                manejador.eliminarLineaDelArchivo(idRuta + "," + idBus + "," + dia + "," + mes + "," + anio + "," + horas + "," + minutos + "," + dHora + "," + dMins + "," + precio);
            }
        });

        getAdminView().LimpiarViajeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getAdminView().idRutaTextFieldViaje.setText("");
                getAdminView().idBusTextFieldViaje.setText("");
                getAdminView().DiaViajeTextField.setText("");
                getAdminView().mesViajeTextField.setText("");
                getAdminView().anioViajeTextField.setText("");
                getAdminView().horaTextField.setText("");
                getAdminView().minutoTextField.setText("");
                getAdminView().horaDuraTextField.setText("");
                getAdminView().minutosDuraTextField.setText("");
                getAdminView().precioTextField.setText("");
            }
        });

    }

}
