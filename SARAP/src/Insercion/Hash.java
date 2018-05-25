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
public class Hash {

    private LinkedList<LinkedList<Usuario>> ListaDeListas;
    private int asientos;

    public Hash(int asientos) {
        setAsientos(asientos);
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public LinkedList<LinkedList<Usuario>> getListaDeListas() {
        return ListaDeListas;
    }

    public void setListaDeListas(LinkedList<LinkedList<Usuario>> ListaDeListas) {
        this.ListaDeListas = ListaDeListas;
    }

    public void agregar(Usuario auxUser) {
        
    }

    public long hashFunc(String email) {
        int intLength = email.length() - 5 / 4;//-5 por el @ y el .com
        long sum = 0;
        for (int j = 0; j < intLength; j++) {
            char c[] = email.substring(j * 4, (j * 4) + 4).toCharArray();
            long mult = 1;
            for (int k = 0; k < c.length; k++) {
                sum += c[k] * mult;
                mult *= 256;
            }
        }

        char c[] = email.substring(intLength * 4).toCharArray();
        long mult = 1;
        for (int k = 0; k < c.length; k++) {
            sum += c[k] * mult;
            mult *= 256;
        }

        return (Math.abs(sum) % getAsientos());
    }
}
