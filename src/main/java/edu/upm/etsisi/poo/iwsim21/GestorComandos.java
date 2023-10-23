package edu.upm.etsisi.poo.iwsim21;

import java.util.Scanner;

public class GestorComandos {
    private GestorUsuarios listaUsuarios;
    private GestorPlanes listaPlanes;
    private GestorActividades listaActividades;
    private Usuario usuarioActivo;
    private ConsolaUsuario consolaUsuario;

    public GestorComandos(GestorUsuarios listaUsuarios, GestorPlanes listaPlanes, GestorActividades listaActividades) {
        this.listaUsuarios = listaUsuarios;
        this.listaPlanes = listaPlanes;
        this.listaActividades = listaActividades;
        this.usuarioActivo = null;
        consolaUsuario = new ConsolaUsuario();
    }

    public String procesarComando(String entrada) {//implementar procesado de comandos

        return entrada;
    }

    public void ejecutarComando(Comando comando) {
    }

    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public void ejecutarBucle() {
        boolean salir = false;

        while (!salir) {
            String comando = consolaUsuario.obtenerComando();

            // Procesa el comando y obtiene la respuesta
            String mensaje = procesarComando(comando);

            consolaUsuario.mostrarMensaje(mensaje);

            // Verifica si el usuario quiere salir
            if (comando.equalsIgnoreCase("salir")) {
                salir = true;
            }
        }

        consolaUsuario.cerrar();
    }

}
