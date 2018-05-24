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
public class Chofer {
    private int numEmpleado;
    private String nombre;
    private Fecha nacimiento;

    public Chofer(int numEmpleado, String nombre, Fecha nacimiento) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
}
