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
public class ListaPersonajePlanta {
    
    NodoPersonaje inicio;
    NodoPersonaje fin;
    
    public ListaPersonajePlanta(){
        inicio = null;
        fin = null;
        
    }
    
     public void InsertarInicio(String tipoP, String imagenP, String NombreP, String distanciaP, int ataqueP, int defensaP){
        NodoPersonaje nuevo = new NodoPersonaje(tipoP, imagenP, NombreP, distanciaP, ataqueP, defensaP, inicio);
        inicio = nuevo;
        if(fin == null)
            fin = inicio;    
    }
    
    public void InsertarFin(String tipoP, String imagenP, String NombreP, String distanciaP, int ataqueP, int defensaP){
        NodoPersonaje nuevo2 = new NodoPersonaje(tipoP, imagenP, NombreP, distanciaP, ataqueP, defensaP, null);
        
        if(inicio == null){
            fin = nuevo2;
            inicio = fin;           
        }
        else{
            fin.setSiguiente(nuevo2);
            fin = nuevo2;
        }
        
    }
    
    public void EliminarInicio(){
        inicio = inicio.siguiente;
    }
    
    public String ExtraerInicio(){
        String info = inicio.getNombreP();
        inicio = inicio.getSiguiente();
        if(inicio == null){
          fin = null;  
        }
        return info;
        
    }
    public String Mostrar(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        
        NodoPersonaje temp = inicio;
        while(temp != null)
        {
            mostrar = mostrar + temp.getNombreP();
           System.out.println(temp.getNombreP()+ temp.getImagenP()+ temp.getTipoP()+temp.getDistanciaP());
            temp = temp.siguiente;            
        }
        return mostrar;   
    }
    
    
    
}
