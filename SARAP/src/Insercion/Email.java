/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

import java.util.StringTokenizer;

/**
 *
 * @author MS
 */
public class Email {

    private String usuario;
    private String dominio;

    public Email(String email) {
        StringTokenizer userDom = new StringTokenizer(email,"@");
        this.usuario = userDom.nextToken();
        StringTokenizer domCom = new StringTokenizer(getUsuario(),".");
        this.dominio = domCom.nextToken();
    }

    public Email(String usuario, String dominio) {
        this.usuario = usuario;
        this.dominio = dominio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String toString() {
        return getUsuario() + "@" + getDominio() + ".com";
    }
}
