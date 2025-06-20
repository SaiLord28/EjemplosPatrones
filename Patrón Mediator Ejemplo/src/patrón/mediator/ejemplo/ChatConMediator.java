/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrón.mediator.ejemplo;

/**
 *
 * @author NIKO
 */
public class ChatConMediator {
    public static void main(String[] args) {
        ChatMediator sala = new SalaChat();

        Usuario ana = new Usuario("Ana", sala);
        Usuario juan = new Usuario("Juan", sala);
        Usuario lucia = new Usuario("Lucía", sala);

        ana.enviar("Holaaaaa");
    }
}
