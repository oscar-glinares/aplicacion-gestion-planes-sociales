package edu.upm.etsisi.poo.iwsim21;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
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
        return planesInscritos;
    }

    public double consultarCostePlanes() {
        double costeTotal = 0.0;
        for(Plan plan : planesInscritos){
            for (Actividad actividad : plan.getActividades()){
                costeTotal += actividad.getCoste();
            }
        }
        return costeTotal;
    }

    protected void unirsePlan(Plan plan){
        planesInscritos.add(plan);
    }

    protected void abandonarPlan(Plan plan){
        planesInscritos.remove(plan);
    }
}
