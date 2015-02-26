/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1EDD.Clases;

import static Practica1EDD.SecundariaPlanta.lp;

/**
 *
 * @author Andrea
 */
public class NodoUsuario {
    private String datos;
    NodoUsuario seguido12;
    
    
    public NodoUsuario(String ii, NodoUsuario ss){
        datos = ii;
        seguido12 = ss;
        
        
        
    }

    

    
   
    

    public String getDatop1() {
        return datos;
    }

    public void setDatop1(String datop1) {
        this.datos = datop1;
    }

    public NodoUsuario getSeguido1() {
        return seguido12;
    }

    public void setSeguido1(NodoUsuario seguido13) {
        this.seguido12 = seguido13;
    }
}
