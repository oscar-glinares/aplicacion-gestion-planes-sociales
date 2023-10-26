package edu.upm.etsisi.poo.iwsim21.cli;

import java.util.Scanner;

public class ConsolaUsuario {
    private Scanner scanner;

    public ConsolaUsuario() {
        scanner = new Scanner(System.in);
    }

    public String obtenerComando() {
        System.out.print("Ingrese un comando: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        scanner.close();
    }
}
