/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.io.IOException;
import subsistema.CifradorArchivo;
import subsistema.EscritorArchivo;
import subsistema.LectorArchivo;

/**
 *
 * @author NIKO
 */

public class FachadaArchivo {
    
    /**
 * Clase que es la fachada "simple" para las operaciones complejas
 * de leer, escribir, cifrar y descifrar los archivos.
 */
    
    // ====================================== Atributos ============================================
    
    private static FachadaArchivo instancia; //---> Instancia Singleton
    
    //referencias de los subsistemas
    
    private LectorArchivo lector;
    private EscritorArchivo escritor;
    private CifradorArchivo cifrador;
    
    //====================================================== Métodos=======================================

    /**
    * Método constructor, es privado por el Singleton.
    * Instancia las referencias de los subsistemas.
    */
    
    private FachadaArchivo() {
        
        lector = new LectorArchivo();
        escritor = new EscritorArchivo();
        cifrador = new CifradorArchivo();
    }
    
    //--------------------------------------------
    
    /**
     * @return Devuelve la UNICA instancia del Singleton.
    */    
    
    public static FachadaArchivo obtenerInstancia() {
        
        if (instancia == null) {
            
            instancia = new FachadaArchivo();
            
        }
        return instancia;
    }
    
    //------------------------------------------
       
    /**
     * Cifra el texto que se mandó en el archivo
     * @param rutaArchivo Ruta del archivo que va a escribir
     * @param contenido Texto original que se va a cifrar
     * @throws java.io.IOException ---> Para que funcionen los métodos de "File"
     */
    

    public void escribirCifrado(String rutaArchivo, String contenido) throws IOException {
        
        String cifrado = cifrador.cifrar(contenido);
        escritor.escribir(rutaArchivo, cifrado);
        
    }
    
    //-------------------------------------------
    
     /**
     * Decifra un mensaje que haya sido cifrado anteriormente.
     * @param rutaArchivo Ruta del archivo que va a leer.
     * @return Texto descifrado
     * @throws java.io.IOException ---> Para que funcionen los métodos de "File"
     */

    public String leerDescifrado(String rutaArchivo) throws IOException {
        String cifrado = lector.leer(rutaArchivo);
        return cifrador.descifrar(cifrado);
    }
}