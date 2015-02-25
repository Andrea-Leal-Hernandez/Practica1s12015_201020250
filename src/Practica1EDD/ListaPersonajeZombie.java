/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1EDD;

import static Practica1EDD.ListaPersonajePlanta.flechaplanta2;
import static Practica1EDD.ListaPersonajePlanta.flechazombie2;
import static Practica1EDD.ListaPersonajePlanta.nodosplanta2;
import static Practica1EDD.ListaPersonajePlanta.nodoszombie2;

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
            mostrar = mostrar + temp.getImagenP() + temp.getNombreP() + temp.getAtaqueP() + temp.getDefensaP() + temp.getTipoP();
           System.out.println(temp.getImagenP() + temp.getNombreP() + temp.getAtaqueP() + temp.getDefensaP() + temp.getTipoP());
            temp = temp.siguiente;            
        }
        return mostrar;   
    }
    
    public String DibujarPersonajeZombie(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        String flechaszo = "";
        NodoPersonaje temp = iniciar;
        while(temp != null)
        {
            mostrar = mostrar + temp.getImagenP()+ ";\n" ;
            flechaszo = flechaszo + temp.getImagenP()+ "->";
             mostrar = mostrar + temp.getNombreP()+ ";\n" ;
            flechaszo = flechaszo + temp.getNombreP()+ "->"; 
            mostrar = mostrar + temp.getAtaqueP()+ ";\n" ;
            flechaszo = flechaszo + temp.getAtaqueP()+ "->"; 
            mostrar = mostrar + temp.getDefensaP()+ ";\n" ;
            flechaszo = flechaszo + temp.getDefensaP()+ "->";
            mostrar = mostrar + temp.getTipoP()+ ";\n" ;
            flechaszo = flechaszo + temp.getTipoP()+ "->"; 
            
            temp = temp.siguiente;            
        }
        
        
        nodoszombie2 = mostrar;
        
        flechazombie2 = flechaszo;
        flechazombie2 = flechazombie2.substring(0, flechazombie2.length()-2)+";";
        return mostrar;   
    }
}
