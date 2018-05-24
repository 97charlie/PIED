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
public class Viaje {
    private Ruta rutaDeViaje;
    private Ruta fechaDeViaje;
    private Hora horaSalida;
    private Hora duracion;
    private Autobus busDeViaje;
    private Double precio;

    public Viaje(Ruta rutaDeViaje, Ruta fechaDeViaje, Hora horaSalida, Hora duracion, Autobus busDeViaje, Double precio) {
        this.rutaDeViaje = rutaDeViaje;
        this.fechaDeViaje = fechaDeViaje;
        this.horaSalida = horaSalida;
        this.duracion = duracion;
        this.busDeViaje = busDeViaje;
        this.precio = precio;
    }

    public Ruta getRutaDeViaje() {
        return rutaDeViaje;
    }

    public void setRutaDeViaje(Ruta rutaDeViaje) {
        this.rutaDeViaje = rutaDeViaje;
    }

    public Ruta getFechaDeViaje() {
        return fechaDeViaje;
    }

    public void setFechaDeViaje(Ruta fechaDeViaje) {
        this.fechaDeViaje = fechaDeViaje;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Hora getDuracion() {
        return duracion;
    }

    public void setDuracion(Hora duracion) {
        this.duracion = duracion;
    }

    public Autobus getBusDeViaje() {
        return busDeViaje;
    }

    public void setBusDeViaje(Autobus busDeViaje) {
        this.busDeViaje = busDeViaje;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
