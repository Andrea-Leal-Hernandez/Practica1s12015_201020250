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
public class ListaPersonajeZombie {
    NodoPersonaje iniciar;
    NodoPersonaje finalizar;
    
    public ListaPersonajeZombie(){
        iniciar = null;
        finalizar = null;   
    }
    
     public void InsertarInicio(String tipoP, String imagenP, String NombreP, String distanciaP, int ataqueP, int defensaP){
        NodoPersonaje nuevo = new NodoPersonaje(tipoP, imagenP, NombreP, distanciaP, ataqueP, defensaP, iniciar);
        iniciar = nuevo;
        if(finalizar == null)
            finalizar = iniciar;    
    }
    
    public void InsertarFin(String tipoP, String imagenP, String NombreP, String distanciaP, int ataqueP, int defensaP){
        NodoPersonaje nuevo2 = new NodoPersonaje(tipoP, imagenP, NombreP, distanciaP, ataqueP, defensaP, null);
        
        if(iniciar == null){
            finalizar = nuevo2;
            iniciar = finalizar;           
        }
        else{
            finalizar.setSiguiente(nuevo2);
            finalizar = nuevo2;
        }
        
    }
    
    public void EliminarInicio(){
        iniciar = iniciar.siguiente;
    }
    
    public String ExtraerInicio(){
        String info = iniciar.getNombreP();
        iniciar = iniciar.getSiguiente();
        if(iniciar == null){
          finalizar = null;  
        }
        return info;
        
    }
    public String Mostrar(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        
        NodoPersonaje temp = iniciar;
        while(temp != null)
        {
            mostrar = mostrar + temp.getNombreP();
           System.out.println(temp.getNombreP());
            temp = temp.siguiente;            
        }
        return mostrar;   
    }
    
    
}
