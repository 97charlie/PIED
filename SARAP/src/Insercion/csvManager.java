package Insercion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author MS
 */
public class csvManager {

    private String csvURL;

    public csvManager(String csvURL) {
        setCsvURL(csvURL);
    }

    private String getCsvURL() {
        return csvURL;
    }

    private void setCsvURL(String csvURL) {
        this.csvURL = csvURL;
    }

    public void agregarLineaAlFinal(String auxString) {
        try {
            FileWriter escritorDoc = new FileWriter(getCsvURL(), true);
            BufferedWriter buffer = new BufferedWriter(escritorDoc);
            PrintWriter impresor = new PrintWriter(buffer);

            impresor.println(auxString);
            impresor.flush();
            impresor.close();

            System.out.println("Se ha agregado " + auxString + " al final del archivo " + getCsvURL());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void agregarLineaAlComienzo(String auxString) {
        try {
            FileWriter escritorDoc = new FileWriter(getCsvURL(), false);
            BufferedWriter buffer = new BufferedWriter(escritorDoc);
            PrintWriter impresor = new PrintWriter(buffer);

            impresor.println(auxString);
            impresor.flush();
            impresor.close();

            System.out.println("Se ha agregado " + auxString + " al comienzo del archivo " + getCsvURL());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

}
