/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema;

/**
 *
 * @author NIKO
 */
import java.util.Base64;

public class CifradorArchivo {
    
 /**
 * Esta clase cifra el texto de los archivos.
 */
    
 //====================================================== Métodos=======================================   
    
    /**
    * Cira el texto usando base 64
     * @param contenido texto sin cifrar
    * @return texto cirado en base 64
    */   
    
    public String cifrar(String contenido) {
        
        return Base64.getEncoder().encodeToString(contenido.getBytes());
    }

    public String descifrar(String contenidoCifrado) {
        
        byte[] decodificado = Base64.getDecoder().decode(contenidoCifrado);
        return new String(decodificado);
        
    }
}
