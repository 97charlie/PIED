package Insercion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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

    public void eliminarLineaDelArchivo(String auxString) {

        try {

            File inputFile = new File(getCsvURL());
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(auxString)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
