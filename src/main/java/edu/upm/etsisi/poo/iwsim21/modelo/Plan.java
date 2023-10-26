package edu.upm.etsisi.poo.iwsim21.modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plan {
    private String nombre;
    private Date fecha;
    private Time hora;
    private String lugarEncuentro;
    private int capacidadMaxima;
    private List<Actividad> actividades;
    private List<Usuario> participantes;
    private Usuario creador;

    public Plan(Date fecha, Time hora, String lugarEncuentro, int capacidadMaxima, Usuario creador, String nombre) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugarEncuentro = lugarEncuentro;
        this.capacidadMaxima = capacidadMaxima;
        this.actividades = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.creador = creador;
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugarEncuentro() {
        return lugarEncuentro;
    }

    public void setLugarEncuentro(String lugarEncuentro) {
        this.lugarEncuentro = lugarEncuentro;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }


    public void agregarActividadEnPlan(Actividad actividad) {
        actividades.add(actividad);
    }

    public void eliminarActividadEnPlan(Actividad actividad) {
        actividades.remove(actividad);
    }

    public boolean usuarioPuedeUnirse(Usuario usuario) {
        if (estaInscritoEnPlan(usuario)) {      //Comprueba si el usuario ya está inscrito en el plan y devuelve false si es asi
            return false;
        }

        if (haAlcanzadoMaximoInscripciones()) {     //Comprueba si el plan está lleno y devuelve false si es asi
            return false;
        }
        return true;
    }

    protected boolean unirsePlan(Usuario usuario) {
        if (usuarioPuedeUnirse(usuario)) {      //Comprueba si el usuario puede unirse al plan
            participantes.add(usuario);     //Añade al usuario a la lista de participantes y devuelve true
            return true;
        }
        return false;
    }

    protected boolean abandonarPlan(Usuario usuario){
        participantes.remove(usuario);
    }

    public boolean esCreador(Usuario usuario) {
        return usuario.equals(this.creador);
    }

    public boolean solapadasTiempo(Plan plan) {
        //Implementar el metodo entero
        return false;
    }

    private boolean haAlcanzadoMaximoInscripciones() {
        return participantes.size() == capacidadMaxima;
    }

    private boolean estaInscritoEnPlan(Usuario usuario) {
        return participantes.contains(usuario);
    }
}
