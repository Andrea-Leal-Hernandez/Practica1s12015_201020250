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
        NodoPlanta nuevo = new NodoPlanta(info, null);
        fin = nuevo;
        if(inicio == null){
            fin = nuevo;
            inicio = fin;           
        }
        else{
            fin.setSeguido(nuevo);
            fin = nuevo;
        }
        
    }
    
    public void EliminarInicio(){
        inicio = inicio.seguido;
    }
    
    public String ExtraerInicio(){
        String info = inicio.getDatop();
        inicio = inicio.getSeguido();
        if(inicio == null){
          fin = null;  
        }
        return info;
        
    }
    
    public void Mostrar(){
        NodoPlanta temp = inicio;
        while(temp != null){
            
            System.out.println(temp.getDatop());
           temp = temp.seguido; 
        }
    }
}
