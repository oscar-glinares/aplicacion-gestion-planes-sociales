package edu.upm.etsisi.poo.iwsim21.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String telefono;
    private int edad;
    private String contrasena;
    private List<Plan> planesInscritos;
    private int busquedasRestantes;

    public Usuario(String nombre, String telefono, int edad, String contrasena) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.contrasena = contrasena;
        this.planesInscritos = new ArrayList<>();
        this.busquedasRestantes = 3;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Plan> consultarPlanesInscritos() {
        return planesInscritos;     //Devuelve la lista de planes incritos
    }

    public double consultarCostePlanes() {
        double costeTotal = 0.0;
        for(Plan plan : planesInscritos){
            for (Actividad actividad : plan.getActividades()){      //Comprueba el coste de cada plan de la lista y lo suma a costeTotal
                costeTotal += actividad.getCoste();
            }
        }
        return costeTotal;      //Devuelve costeTotal
    }

    public boolean comprobarContraseñaIgual(String contrasena){
        if(contrasena.equals(this.contrasena)){     ////Comprueba si la contraseña dada es igual a la contraseña de este usuario y devuelve true si es cierto
            return true;
        }
    }

    public boolean comprobarNombreIgual(String nombre){
        if (nombre.equals(this.nombre)){        //Comprueba si el nombre dado es igual al nombre de este usuario y devuelve true si es cierto
            return true;
        }
    }

    protected void unirsePlan(Plan plan){
        planesInscritos.add(plan);      //Añade el plan a los planes inscritos
    }

    protected void abandonarPlan(Plan plan){
        planesInscritos.remove(plan);       //Elimina el plan de los planes inscritos
    }
}
