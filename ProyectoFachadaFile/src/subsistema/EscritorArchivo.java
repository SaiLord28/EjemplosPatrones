/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema;

/**
 *
 * @author NIKO
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EscritorArchivo {
    
 /**
 * Clase que escribe dentro de los archivos.
 */
    
 //====================================================== Métodos=======================================   
    
    /**
    * Escribe lo que va a ir dentro de un archivo
    * @param rutaArchivo Ruta del archivo que va a escribir
     * @param contenido nuevo texto que irá en el archivo
     * @throws java.io.IOException ---> Para que funcionen los métodos de "File"
    */      
    
    public void escribir(String rutaArchivo, String contenido) throws IOException {
        Files.write(Paths.get(rutaArchivo), contenido.getBytes());
        
    }
}