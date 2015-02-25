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
    NodoUsuario inicio;
    NodoUsuario fin;
   public static String nodosplanta;
   public static String nodoszombie;
   public static String flechazombie;
   public static String flechaplanta;
    
    public ListaPlanta(){
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
        NodoUsuario nuevo2 = new NodoUsuario(info, null);
       
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
        
        NodoUsuario temp = inicio;
        while(temp != null)
        {
            mostrar = mostrar + temp.getDatop1()+ "\n";
           System.out.println(temp.getDatop1());
            temp = temp.seguido12;            
        }
        return mostrar;   
    }
    
    public String DibujarPlanta(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        String flechas = "";
        NodoUsuario temp = inicio;
        while(temp != null)
        {
            mostrar = mostrar + temp.getDatop1() + ";\n" ;
            flechas = flechas + temp.getDatop1() + "->";
            temp = temp.seguido12;            
        }
        nodosplanta = mostrar;
        flechaplanta = flechas;
        flechaplanta = flechaplanta.substring(0, flechaplanta.length()-2)+";";
        return mostrar;   
    }
     
}
