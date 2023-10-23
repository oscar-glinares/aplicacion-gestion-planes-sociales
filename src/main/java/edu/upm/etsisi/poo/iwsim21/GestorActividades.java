package edu.upm.etsisi.poo.iwsim21;
import java.util.List;

public class GestorActividades {
    private List<Actividad> actividadList;

    public GestorActividades(List<Actividad> actividadesDisponibles) {
        this.actividadList = actividadesDisponibles;
    }

    public void agregarActividad(Actividad actividad) {
        actividadList.add(actividad);
    }

    public void eliminarActividad(Actividad actividad) {
        actividadList.remove(actividad);
    }

    public void crearActividad(String tipo, int aforo, int duracion, double coste, String nombre, String descripcion){
        Actividad actividad = new Actividad(tipo, aforo, duracion, coste, nombre, descripcion);
        agregarActividad(actividad);
    }

    public List<Actividad> buscarActividadesDisponibles() {
        return actividadList;
    }

    public List<Actividad> buscarActividadesPorTipo(String tipo) {
         }

    public List<Actividad> buscarPlanesPorDuracion() {
        // Implementar busqueda de actividades por lugar
    }

    public List<Actividad> buscarPlanesPorCoste() {
        // Implementar busqueda de actividades por fecha
    }

    public List<Actividad> buscarPlanesPorDescripcion() {
        // Implementar busqueda de actividades por hora
    }

    public List<Actividad> buscarPlanesPorNombre() {
        // Implementar busqueda de actividades por nombre
    }
}
