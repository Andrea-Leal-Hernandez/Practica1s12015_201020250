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
public class NodoPlanta {
    private String datop;
    NodoPlanta seguido;
    
    
    public NodoPlanta(String i, NodoPlanta s){
        datop = i;
        seguido = s;
        
        
        
    }

    public String getDatop() {
        return datop;
    }

    public void setDatop(String datop) {
        this.datop = datop;
    }

    public NodoPlanta getSeguido() {
        return seguido;
    }

    public void setSeguido(NodoPlanta seguido) {
        this.seguido = seguido;
    }
}
