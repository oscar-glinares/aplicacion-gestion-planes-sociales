package edu.upm.etsisi.poo.iwsim21;

public class Actividad {
    private String tipo;
    private int aforo;
    private int duracion;
    private double coste;
    private String nombre;
    private String descripcion;

    public Actividad(String tipo, int aforo, int duracion, double coste, String nombre, String descripcion) {
        this.tipo = tipo;
        this.aforo = aforo;
        this.duracion = duracion;
        this.coste = coste;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
