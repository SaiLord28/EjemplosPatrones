/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrón.mediator.ejemplo;

/**
 *
 * @author NIKO
 */
public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void registrarUsuario(Usuario usuario);
}
