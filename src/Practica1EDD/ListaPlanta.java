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
public class ListaPlanta {
    NodoPlanta inicio;
    NodoPlanta fin;
    
    public ListaPlanta(){
        inicio = null;
        fin = null;
        
    }
    
    public void InsertarInicio(String info){
        NodoPlanta nuevo = new NodoPlanta(info, inicio);
        inicio = nuevo;
        if(fin == null)
            fin = inicio;    
    }
    
    public void InsertarFin(String info){
        NodoPlanta nuevo2 = new NodoPlanta(info, null);
        fin = nuevo2;
        if(inicio == null){
            fin = nuevo2;
            inicio = fin;           
        }
        else{
            fin.setSeguido1(nuevo2);
            fin = nuevo2;
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
        
        NodoPlanta temp = inicio;
        while(temp != null)
        {
           System.out.println(temp.getDatop1());
            temp = temp.seguido12;            
        }
        return mostrar;   
    }
    
}
