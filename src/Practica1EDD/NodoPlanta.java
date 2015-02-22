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
    private String datos;
    NodoPlanta seguido12;
    
    
    public NodoPlanta(String ii, NodoPlanta ss){
        datos = ii;
        seguido12 = ss;
        
        
        
    }

    

    public String getDatop1() {
        return datos;
    }

    public void setDatop1(String datop1) {
        this.datos = datop1;
    }

    public NodoPlanta getSeguido1() {
        return seguido12;
    }

    public void setSeguido1(NodoPlanta seguido13) {
        this.seguido12 = seguido13;
    }
}
