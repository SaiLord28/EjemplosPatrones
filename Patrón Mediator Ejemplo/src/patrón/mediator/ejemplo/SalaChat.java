/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrón.mediator.ejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NIKO
 */
public class SalaChat implements ChatMediator {
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibirMensaje(mensaje, emisor);
            }
        }
    }
}
