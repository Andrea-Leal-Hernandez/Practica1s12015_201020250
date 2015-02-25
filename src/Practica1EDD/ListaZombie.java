/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1EDD;

import static Practica1EDD.ListaPlanta.flechazombie;
import static Practica1EDD.ListaPlanta.nodoszombie;

/**
 *
 * @author Andrea
 */
public class ListaZombie {
    NodoUsuario inicio;
    NodoUsuario fin;
    
    public ListaZombie(){
        inicio = null;
        fin = null;
        
    }
    
    public void InsertarInicio(String info){
        NodoUsuario nuevo = new NodoUsuario(info, inicio);
        inicio = nuevo;
        if(fin == null)
            fin = inicio;    
    }
    
    public void InsertarFin(String info){
        NodoUsuario nuevos = new NodoUsuario(info, null);
        
        if(inicio == null){
            fin = nuevos;
            inicio = fin;           
        }
        else{
            fin.setSeguido1(nuevos);
            fin = nuevos;
        }
        
    }
    
    public void EliminarInicio(){
        inicio = inicio.seguido12;
    }
    
    public String ExtraerInicio(){
        String info = inicio.getDatop1();
        inicio = inicio.getSeguido1();
        if(inicio == null){
          fin = null;  
        }
        return info;
        
    }
    public String Mostrar(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        
        NodoUsuario temp = inicio;
        while(temp != null)
        {
            mostrar = mostrar + temp.getDatop1()+ "\n";
           System.out.println(temp.getDatop1());
            temp = temp.seguido12;            
        }
        return mostrar;   
    }
   public String DibujarZombie(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        String flechasz = "";
        NodoUsuario temp = inicio;
        while(temp != null)
        {
            mostrar = mostrar + temp.getDatop1() + ";\n" ;
            flechasz = flechasz + temp.getDatop1() + "->";
           System.out.println(temp.getDatop1());
            temp = temp.seguido12;            
        }
        nodoszombie = mostrar;
        flechazombie = flechasz;
        flechazombie = flechazombie.substring(0, flechazombie.length()-2)+ ";";
        
        return mostrar;  
    } 
}
