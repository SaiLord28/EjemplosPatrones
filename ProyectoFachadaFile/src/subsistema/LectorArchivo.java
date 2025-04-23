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

public class LectorArchivo {
 /**
 * Esta clase lee el texto de los archivos.
 */
    
 //====================================================== Métodos=======================================   
    
    /**
    * Lee el texto de un archivo y lo retorna.
    * @param rutaArchivo Ruta del archivo que va a escribir
    * @return texto en el archivo pero en String
     * @throws java.io.IOException ---> Para que funcionen los métodos de "File"
    */   
    
    public String leer(String rutaArchivo) throws IOException {
        
        byte[] bytes = Files.readAllBytes(Paths.get(rutaArchivo));
        return new String(bytes);
        
    }
}