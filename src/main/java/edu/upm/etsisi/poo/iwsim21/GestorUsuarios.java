package edu.upm.etsisi.poo.iwsim21;

import java.util.List;

public class GestorUsuarios {
    private List<Usuario> usuarioList;

    public GestorUsuarios(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarioList.remove(usuario);
    }

    public Usuario buscarUsuarioPorNombre(String nombre){
        for(Usuario usuario : usuarioList){
            if(usuario.getNombre().equals(nombre)){     //Implementar metodo para comprobar si un usuario comparte nombre por close friends
                return usuario;
            }
        }
        return null;
    }

    public Usuario autenticarInicioSesion(String nombre, String contraseña){
        for(Usuario usuario : usuarioList){
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contraseña)){ //Implementar metodos para close friends
                return usuario;
            }
        }
        return null;
    }
}
