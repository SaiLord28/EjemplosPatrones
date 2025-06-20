/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrón.mediator.ejemplo;

/**
 *
 * @author NIKO
 */
class Usuario {
    private String nombre;
    private ChatMediator mediador;

    public Usuario(String nombre, ChatMediator mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        mediador.registrarUsuario(this);
    }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje, Usuario emisor) {
        System.out.println(nombre + " recibió de " + emisor.getNombre() + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}
