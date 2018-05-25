/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

import java.util.LinkedList;

/**
 *
 * @author MS
 */
public class Ruta {
    private int idRuta;
    private String origen;
    private String destino;
    private LinkedList<String> intermedios;

    public Ruta(int idRuta, String origen, String destino, LinkedList<String> intermedios) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
        this.intermedios = intermedios;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LinkedList<String> getIntermedios() {
        return intermedios;
    }

    public void setIntermedios(LinkedList<String> intermedios) {
        this.intermedios = intermedios;
    }
    
    
    
}
