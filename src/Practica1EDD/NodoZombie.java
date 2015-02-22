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
public class NodoZombie {
    private String datop11;
    NodoZombie seguido11;
    
    
    public NodoZombie(String i, NodoZombie s){
        datop11 = i;
        seguido11 = s;
        
        
        
    }

    public String getDatop() {
        return datop11;
    }

    public void setDatop(String datop2) {
        this.datop11 = datop2;
    }

    public NodoZombie getSeguido() {
        return seguido11;
    }

    public void setSeguido(NodoZombie seguido) {
        this.seguido11 = seguido;
    }
}
