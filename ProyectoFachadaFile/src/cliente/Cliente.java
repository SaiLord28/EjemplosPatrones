/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import fachada.FachadaArchivo;
import java.io.IOException;

/**
 *
 * @author NIKO
 */

public class Cliente {
    
 /**
 * Clase principal, usa la fachada en lugar de los procedimientos complejos
 */
    
  //====================================================== Métodos=======================================

    /**
    * Método Main.
     * @param args argumento del Main
     * @throws java.io.IOException ---> Para que funcionen los métodos de "File"
    */
    
    public static void main(String[] args) throws IOException {
        
        String ruta = "archivo.txt";
        
        String textoOriginal = "Profe, vea mi documentación, no merezco más de 0.5?  D: "; // ----> IMPORTANTE jaskjas

        FachadaArchivo fachada = FachadaArchivo.obtenerInstancia();
        
        fachada.escribirCifrado(ruta, textoOriginal);
        
        String leido = fachada.leerDescifrado(ruta);
        
        System.out.println("el texto decifrado es: " + leido);
        
    }
    
}
