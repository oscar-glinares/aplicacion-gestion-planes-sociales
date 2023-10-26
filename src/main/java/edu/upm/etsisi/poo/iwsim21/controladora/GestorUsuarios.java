package edu.upm.etsisi.poo.iwsim21.controladora;

import edu.upm.etsisi.poo.iwsim21.modelo.Usuario;

import java.util.List;

public class GestorUsuarios {
    private List<Usuario> usuarioList;

    public GestorUsuarios(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarioList.add(usuario);       //Añade el usuario a la lista de usuarios
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarioList.remove(usuario);        //Elimina el usuario de la lista de usuarios
    }

    public Usuario buscarUsuarioPorNombre(String nombre){
        for(Usuario usuario : usuarioList){
            if(usuario.comprobarNombreIgual(nombre)){     //Implementar metodo para comprobar si un usuario comparte nombre por close friends
                return usuario;
            }
        }
        return null;
    }

    public Usuario autenticarInicioSesion(String nombre, String contrasena){
        for(Usuario usuario : usuarioList){
            if (usuario.comprobarNombreIgual(nombre) && usuario.comprobarContraseñaIgual(contrasena)){      //Implementar metodos para close friends
                return usuario;
            }
        }
        return null;
    }
}
