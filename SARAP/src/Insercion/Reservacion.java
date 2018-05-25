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
public class Reservacion {
    private String origen;
    private String destino;
    private Fecha fechaDeSalida;
    private Fecha fechaDeRegreso;
    private Hora horaLlegada;

    public Reservacion(String origen, String destino, Fecha fechaDeSalida, Fecha fechaDeRegreso, Hora horaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeRegreso = fechaDeRegreso;
        this.horaLlegada = horaLlegada;
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

    public Fecha getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Fecha fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Fecha getFechaDeRegreso() {
        return fechaDeRegreso;
    }

    public void setFechaDeRegreso(Fecha fechaDeRegreso) {
        this.fechaDeRegreso = fechaDeRegreso;
    }

    public Hora getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Hora horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return getOrigen() + "," + getDestino() + "," + getFechaDeSalida() + "," + getFechaDeRegreso() + "," + getHoraLlegada();
    }
    
    
}
