package edu.upm.etsisi.poo.iwsim21;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class GestorPlanes {
    private List<Plan> planList;

    public GestorPlanes(List<Plan> planList) {
        this.planList = planList;
    }

    public void añadirPlan(Plan plan) {
        planList.add(plan);
    }

    public boolean eliminarPlan(Plan plan, Usuario creador) {
        if(plan.esCreador(creador)) {
            planList.remove(plan);
        }
    }

    public List<Plan> buscarPlanesDisponibles() {
        // Implementar busqueda de planes disponibles
    }
    public void unirsePlan(Plan plan, Usuario usuario){
        plan.unirsePlan(usuario);
        usuario.unirsePlan(plan);
    }

    public void abandonarPlan(Plan plan, Usuario usuario){
        plan.abandonarPlan(usuario);
        usuario.abandonarPlan(plan);
    }

    public void crearPlan (Date fecha, Time hora, String lugarEncuentro, int capacidadMaxima, Usuario creador, String nombre){
        Plan plan = new Plan(fecha, hora, lugarEncuentro, capacidadMaxima, creador, nombre);
        añadirPlan(plan);
    }

    public List<Plan> buscarPlanesPorLugar() {
        // Implementar busqueda de planes por lugar
    }

    public List<Plan> buscarPlanesPorFecha() {
        // Implementar busqueda de planes por fecha
    }

    public List<Plan> buscarPlanesPorHora() {
        // Implementar busqueda de planes por hora
    }

    public List<Plan> buscarPlanesPorNombre() {
        // Implementar busqueda de planes por nombre
    }
}
