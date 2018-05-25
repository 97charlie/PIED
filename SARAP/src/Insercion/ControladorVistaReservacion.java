/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author MS
 */
public class ControladorVistaReservacion {

    private vistaReservacion reservacionView;
    private Usuario user;
    private Hash tablaHash;

    public ControladorVistaReservacion() {
        iniciarVista();
    }

    public vistaReservacion getReservacionView() {
        return reservacionView;
    }

    public void setReservacionView(vistaReservacion reservacionView) {
        this.reservacionView = reservacionView;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }


    public Hash getTablaHash() {
        return tablaHash;
    }

    public void setTablaHash(Hash tablaHash) {
        this.tablaHash = tablaHash;
    }
    
    
    
    
    public void iniciarVista() {
        setReservacionView(new vistaReservacion());
        getReservacionView().setVisible(true);
        iniciarActionListeners();
        setTablaViajes();
    }

    private void setTablaViajes() {
        try {
            Scanner lectorArchivo = new Scanner(new File("Viaje.txt"));
            int i = 0;
            while (lectorArchivo.hasNextLine()) {
                String lectorLine = lectorArchivo.nextLine();
                StringTokenizer tokenizedLine = new StringTokenizer(lectorLine, ",");
                int elementos = tokenizedLine.countTokens();

                CsvManager manejadorRutas = new CsvManager("Ruta.txt");
                String ruta = manejadorRutas.buscarEnArchivoDarLinea(tokenizedLine.nextToken());
                StringTokenizer rutaTokenizer = new StringTokenizer(ruta, ",");
                String origen = rutaTokenizer.nextToken();
                String destino = rutaTokenizer.nextToken();

                CsvManager manejadorBuses = new CsvManager("Autobus.txt");
                String bus = manejadorBuses.buscarEnArchivoDarLinea(tokenizedLine.nextToken());
                StringTokenizer busTokenizer = new StringTokenizer(bus, ",");
                busTokenizer.nextToken();
                String marca = busTokenizer.nextToken();

                String diaS = tokenizedLine.nextToken();
                String mesS = tokenizedLine.nextToken();
                String anioS = tokenizedLine.nextToken();
                String horaS = tokenizedLine.nextToken();
                String minS = tokenizedLine.nextToken();
                String salida = diaS + "/" + mesS + "/" + anioS + "|" + horaS + ":" + minS;

                String duraHora = tokenizedLine.nextToken();
                String duraMin = tokenizedLine.nextToken();
                String llegada = diaS + "/" + mesS + "/" + anioS + "|" + Integer.parseInt(horaS) + Integer.parseInt(duraHora) + ":" + Integer.parseInt(minS) + Integer.parseInt(duraMin);
                //String duracion = duraHora + ":" + duraMin;

                String precio = tokenizedLine.nextToken();

                getReservacionView().ViajesTable.setValueAt(origen, i, 0);
                getReservacionView().ViajesTable.setValueAt(destino, i, 1);
                getReservacionView().ViajesTable.setValueAt(salida, i, 2);
                getReservacionView().ViajesTable.setValueAt(llegada, i, 3);
                getReservacionView().ViajesTable.setValueAt(precio, i, 4);
                getReservacionView().ViajesTable.setValueAt(marca, i, 5);

                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void iniciarActionListeners() {
        getReservacionView().CerrarSesionButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getReservacionView().setVisible(false);
                new ControladorLogin();
                getReservacionView().dispose();
            }
        });
        getReservacionView().AgregarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String origen = getReservacionView().OrigenTextField.getText();
                String destino = getReservacionView().DestinoTextField.getText();

                CsvManager manejador = new CsvManager("Viaje.txt");
                String boolString = manejador.buscarEnArchivoDarLinea(origen, destino);
                if (boolString != null) {
                    StringTokenizer bsTokenizer = new StringTokenizer(boolString,",");
                    bsTokenizer.nextToken();//ruta
                    
                    CsvManager manejadorBus = new CsvManager("Autobus.txt");
                    String bus = manejadorBus.buscarEnArchivoDarLinea(bsTokenizer.nextToken());//Autobus
                    
                    StringTokenizer busTokenizer = new StringTokenizer(bus,",");
                    busTokenizer.nextToken();//idBus
                    busTokenizer.nextToken();//idMarca
                    //hash
                    tablaHash = new Hash(Integer.parseInt(busTokenizer.nextToken()));//asientos
                    tablaHash.agregar(user);
                    tablaHash.toString();
                    //-----------
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un viaje con esas características");
                }
            }
        });

        getReservacionView().LimpiarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getReservacionView().OrigenTextField.setText("");
                getReservacionView().DestinoTextField.setText("");
                getReservacionView().DiaSalidaTextField.setText("");
                getReservacionView().mesSalidaTextField.setText("");
                getReservacionView().anioSalidaTextField.setText("");
                getReservacionView().diaRegresoTextField.setText("");
                getReservacionView().mesRegresoTextField.setText("");
                getReservacionView().anioRegresoTextField.setText("");
                getReservacionView().horasTextField.setText("");
                getReservacionView().minutosTextField.setText("");
            }
        });

    }
}
