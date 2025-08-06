package main.java.ejercicio2;

import main.java.interfaces.Ejecutable;

public class VariablesSimples implements Ejecutable {
    @Override
    public void ejecutar() {
        String nombre = "Guillermo Campoy";
        int edad = 41;
        double altura = 1.83;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Estudiante: " + estudiante);
    }
}
