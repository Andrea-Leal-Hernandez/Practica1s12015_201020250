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
public class ListaZombie {
    NodoZombie inicio;
    NodoZombie fin;
    
    public ListaZombie(){
        inicio = null;
        fin = null;
        
    }
    
    public void InsertarInicio(String info){
        NodoZombie nuevo = new NodoZombie(info, inicio);
        inicio = nuevo;
        if(fin == null)
            fin = inicio;    
    }
    
    public void InsertarFin(String info){
        NodoZombie nuevos = new NodoZombie(info, null);
        fin = nuevos;
        if(inicio == null){
            fin = nuevos;
            inicio = fin;           
        }
        else{
            fin.setSeguido(nuevos);
            fin = nuevos;
        }
        
    }
    
    public void EliminarInicio(){
        inicio = inicio.seguido11;
    }
    
    public String ExtraerInicio(){
        String info = inicio.getDatop();
        inicio = inicio.getSeguido();
        if(inicio == null){
          fin = null;  
        }
        return info;
        
    }
    public String Mostrar(){
        String mostrar = ""; // string que ayudara a mostrar la informacion actual
        
        NodoZombie temp = inicio;
        while(temp != null)
        {
           System.out.println(temp.getDatop());
            temp = temp.seguido11;            
        }
        return mostrar;   
    }
    
}
