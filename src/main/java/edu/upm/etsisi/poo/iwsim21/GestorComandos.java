package edu.upm.etsisi.poo.iwsim21;

import edu.upm.etsisi.poo.iwsim21.controladora.GestorActividades;
import edu.upm.etsisi.poo.iwsim21.controladora.GestorPlanes;
import edu.upm.etsisi.poo.iwsim21.controladora.GestorUsuarios;
import edu.upm.etsisi.poo.iwsim21.modelo.Comando;
import edu.upm.etsisi.poo.iwsim21.modelo.Usuario;
import edu.upm.etsisi.poo.iwsim21.cli.ConsolaUsuario;

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

    public String ejecutarComando(Comando comando) {
        String respuesta = "";

            switch (comando.getNombre().toLowerCase()) {
                case "registrarse":
                    // Implementar registrar un nuevo usuario
                    respuesta = "Usuario registrado con éxito.";
                    break;

                case "iniciarsesion":
                    // Implementar iniciar sesión
                    respuesta = "Sesión iniciada.";
                    break;

                case "crearactividad":
                    // Implementar crear una actividad
                    respuesta = "Actividad creada con éxito.";
                    break;

                case "crearplan":
                    // Implementar crear un nuevo plan
                    respuesta = "Plan creado con éxito.";
                    break;

                case "eliminarplan":
                    // Implementar eliminar plan
                    respuesta = "Plan eliminado con éxito.";
                    break;

                case "verplanesdisponibles":
                    // Implementar ver planes disponibles
                    respuesta = "Esta es la lista de planes disponibles:";
                    // Agregar aquí la lista de planes disponibles
                    break;

                case "unirseaplan":
                    // Implementar unirse a un plan
                    respuesta = "Te has unido al plan.";
                    break;

                case "verplanessuscritos":
                    // Implementar ver planes a los que el usuario está suscrito
                    respuesta = "Esta es la lista de planes a los que estás suscrito:";
                    // Implementar enseñar la lista de planes suscritos
                    break;

                case "calcularcosteplanessuscritos":
                    // Implementar calcular el coste de planes suscritos
                    respuesta = "El coste total de tus planes suscritos es: X";
                    // Calcular el coste aquí
                    break;

                    /*Implementar  el resto de casos*/

                case "salir":
                    respuesta = "Saliendo del programa.";
                    break;

                default:
                    respuesta = "Comando invalido. Intentalo de nuevo.";
                    break;
            }
        }

    public String procesarComando(String comando) {
    }

    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public void ejecutarBucle() {
        boolean salir = false;

        while (!salir) {
            String comandoString = consolaUsuario.obtenerComando();
            Comando comando = procesarComando(comandoString);

            // Procesa el comando y obtiene la respuesta
            String mensaje = procesarComando(comandoString);

            consolaUsuario.mostrarMensaje(mensaje);

            // Verifica si el usuario quiere salir
            if (mensaje.equalsIgnoreCase("salir")) {
                salir = true;
            }
        }

        consolaUsuario.cerrar();
    }

}
