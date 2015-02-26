
package Practica1EDD.Clases;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FiltroPZ extends FileFilter {
    // creacion de variables
    private String des = "ext ";
    private String[] ext;

    public FiltroPZ(String extension) {
        this(new String[]{extension});
    } 

    public FiltroPZ(String descripcion, String[] extensiones) {
        this.des = descripcion;
        this.ext = extensiones;
        descripcion();
    }
    // añade extenciones
    private void descripcion()
    {
        for(int i = 0;i < ext.length; i++)
        {
            des += "" + ext[i];
        }
    }
     
    @Override
    public boolean accept(File f) {
        if(f.isDirectory())
        {
            return true;
        }else{
            for(int i = 0; i < ext.length; i ++)
            {
                if(f.getName().endsWith(ext[i]))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public FiltroPZ(String[] extensiones) {
        this.ext = extensiones;
        descripcion();
    }
    @Override
    public String getDescription() {
        return des;
    }
}
