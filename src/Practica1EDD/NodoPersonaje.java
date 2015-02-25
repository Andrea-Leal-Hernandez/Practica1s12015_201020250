/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1EDD;

/**
 *
 * @author Andrea
 */
public class NodoPersonaje {
    public static String cod;
    private String tipoP;
    private String imagenP;
    private String NombreP;
    private String distanciaP;
    private int ataqueP;
    private int defensaP;
    NodoPersonaje siguiente;

    public NodoPersonaje(String tipoP, String imagenP, String NombreP, String distanciaP, int ataqueP, int defensaP, NodoPersonaje siguiente) {
        this.tipoP = tipoP;
        this.imagenP = imagenP;
        this.NombreP = NombreP;
        this.distanciaP = distanciaP;
        this.ataqueP = ataqueP;
        this.defensaP = defensaP;
        this.siguiente = siguiente;
    }

    public static String getCod() {
        return cod;
    }

    public static void setCod(String cod) {
        NodoPersonaje.cod = cod;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getDistanciaP() {
        return distanciaP;
    }

    public void setDistanciaP(String distanciaP) {
        this.distanciaP = distanciaP;
    }

    public int getAtaqueP() {
        return ataqueP;
    }

    public void setAtaqueP(int ataqueP) {
        this.ataqueP = ataqueP;
    }

    public int getDefensaP() {
        return defensaP;
    }

    public void setDefensaP(int defensaP) {
        this.defensaP = defensaP;
    }

    public NodoPersonaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersonaje siguiente) {
        this.siguiente = siguiente;
    }

    
   
        
        
    
    
}
