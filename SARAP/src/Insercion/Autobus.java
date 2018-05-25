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
public class Autobus {
    private int idAutobus;
    private int numAsientos;
    private String marca;
    private String modelo;

    public Autobus(int idAutobus, int numAsientos, String marca, String modelo) {
        this.idAutobus = idAutobus;
        this.numAsientos = numAsientos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getIdAutobus() {
        return idAutobus;
    }

    public void setIdAutobus(int idAutobus) {
        this.idAutobus = idAutobus;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    
    
    
}
