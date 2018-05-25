package Insercion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ControladorLogin {

    private Login logFrame;

    public ControladorLogin() {
        iniciarVista();
    }

    public Login getLogFrame() {
        return logFrame;
    }

    public void setLogFrame(Login logFrame) {
        this.logFrame = logFrame;
    }

    public void iniciarVista() {
        setLogFrame(new Login());
        getLogFrame().setVisible(true);
        iniciarActionListeners();
    }

    public void iniciarActionListeners() {
        getLogFrame().IngresarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nombre = getLogFrame().EmailTextField.getText();
                String pass = getLogFrame().passTextField.getText();
                System.out.println("mail: " + nombre + " pass: "+pass);
                
                if (nombre.equals("admin") && pass.equals("admin")) {
                    getLogFrame().setVisible(false);
                    new ControladorVistaAdministrador();
                    getLogFrame().dispose();
                } else {
                    CsvManager manejador = new CsvManager("Usuario.txt");
                    String boolString = manejador.buscarEnArchivoDarLinea(nombre, pass);
                    if (boolString != null) {
                        getLogFrame().setVisible(false);
                        new ControladorVistaReservacion();
                        getLogFrame().dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no válido");
                    }
                }
            }
        });

        getLogFrame().RegistrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nombre = getLogFrame().nombreTextField.getText();
                String ape = getLogFrame().apeTextField.getText();
                String pass = getLogFrame().passRegistrarTextField.getText();
                String email = getLogFrame().emailRegistrarTextField.getText();

                CsvManager manejador = new CsvManager("Usuario.txt");
                manejador.agregarLineaAlFinal(nombre + "," + ape + "," + pass + "," + email);
            }
        });

    }
}
