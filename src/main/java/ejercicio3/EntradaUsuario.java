package main.java.ejercicio3;

import main.java.interfaces.Ejecutable;

import java.util.Scanner;

public class EntradaUsuario implements Ejecutable {
    @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("===Resultados===");
        System.out.println("Nombre: " + nombre + ", Edad " + edad +" años");
    }
}
