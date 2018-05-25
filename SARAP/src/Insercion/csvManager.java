package Insercion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

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

    public String buscarEnArchivoDarLinea(String auxString) {

        try {
            Scanner lectorArchivo = new Scanner(new File(getCsvURL()));

            while (lectorArchivo.hasNextLine()) {
                String lectorLine = lectorArchivo.nextLine();
                StringTokenizer tokenizedLine = new StringTokenizer(lectorLine, ",");

                for (int i = 0; i < tokenizedLine.countTokens(); i++) {
                    if (tokenizedLine.nextToken().equals(auxString)) {
                        return lectorLine;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return null;
    }

    public String buscarEnArchivoDarNumLinea(String auxString) {

        try {
            Scanner lectorArchivo = new Scanner(new File(getCsvURL()));

            while (lectorArchivo.hasNextLine()) {
                String lectorLine = lectorArchivo.nextLine();
                StringTokenizer tokenizedLine = new StringTokenizer(lectorLine, ",");

                for (int i = 0; i < tokenizedLine.countTokens(); i++) {
                    if (tokenizedLine.nextToken().equals(auxString)) {
                        return lectorLine;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return null;
    }

}
