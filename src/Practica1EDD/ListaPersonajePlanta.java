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
    
    NodoPersonaje iniciar;
    NodoPersonaje finalizar;
    public static String nodosplanta2;
   public static String nodoszombie2;
   public static String flechazombie2;
   public static String flechaplanta2;
    
    public ListaPersonajePlanta(){
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
    
    public String DibujarPersonajePlanta(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        String flechaspla = "";
        NodoPersonaje temp = iniciar;
        while(temp != null)
        {
            mostrar = mostrar + temp.getImagenP()+ ";\n" ;
            flechaspla = flechaspla + temp.getImagenP()+ "->";
             mostrar = mostrar + temp.getNombreP()+ ";\n" ;
            flechaspla = flechaspla + temp.getNombreP()+ "->"; 
            mostrar = mostrar + temp.getAtaqueP()+ ";\n" ;
            flechaspla = flechaspla + temp.getAtaqueP()+ "->"; 
            mostrar = mostrar + temp.getDefensaP()+ ";\n" ;
            flechaspla = flechaspla + temp.getDefensaP()+ "->"; 
            mostrar = mostrar + temp.getTipoP()+ ";\n" ;
            flechaspla = flechaspla + temp.getTipoP()+ "->"; 
            
            temp = temp.siguiente;            
        }
        nodosplanta2 = mostrar;
        flechaplanta2 = flechaspla;
        flechaplanta2 = flechaplanta2.substring(0, flechaplanta2.length()-2) + ";";
        return mostrar;   
    }
    
}
