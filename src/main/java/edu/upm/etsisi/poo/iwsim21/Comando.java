package edu.upm.etsisi.poo.iwsim21;

import java.util.List;

public class Comando {
    private String nombre;
    private List<String> argumentos;

    public Comando(String nombre, List<String> argumentos) {
        this.nombre = nombre;
        this.argumentos = argumentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }
}
