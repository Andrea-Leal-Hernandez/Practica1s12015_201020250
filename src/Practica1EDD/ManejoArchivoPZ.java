/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EDD;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ManejoArchivoPZ{
    // cuenta las lineas del arvhivo
    public int ContarLineas(File archivo)     
    {
        String linea2;
        int linea = 0;
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            linea2 = null;
            while((linea2 = br.readLine()) != null) {                          
               linea = linea + 1;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return linea;
    }
    // lee el archivo y lo guarda en una variable
    public String leerArchivo(File archivo)
{
        String todo = "";
        String linea;
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            linea = null;    
            while((linea = br.readLine()) != null)  {              
                todo = todo + linea + "\n";               
            };
            fr.close();
            br.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }     
        return todo;
}
    // escribe en un archivo el string que se le pasa como argumento
     public void escribirArchivo(File archivo, String datos)
{  
        try{
            FileWriter fr = new FileWriter(archivo);
            fr.write(datos);
            fr.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }     
 
    }
  
}