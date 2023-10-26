package edu.upm.etsisi.poo.iwsim21.controladora;

import edu.upm.etsisi.poo.iwsim21.modelo.Plan;
import edu.upm.etsisi.poo.iwsim21.modelo.Usuario;

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
            planList.remove(plan);      //Comprueba si el usuario es el creador del plan y si lo es, lo elimina
        }
    }

    public List<Plan> buscarPlanesDisponibles() {
        // Implementar busqueda de planes disponibles
    }
    public void unirsePlan(Plan plan, Usuario usuario){
        plan.unirsePlan(usuario);
        usuario.unirsePlan(plan);       //Llama a los metodos de Plan y Usuario para dejar el plan enlazado al usuario
    }

    public void abandonarPlan(Plan plan, Usuario usuario){
        plan.abandonarPlan(usuario);
        usuario.abandonarPlan(plan);        //Llama a los metodos de Plan y Usuario para eliminar las referencias entre ambos
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
