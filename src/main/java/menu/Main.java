package main.java.menu;

import ejercicios.ejercicio1.HolaMundo;
import ejercicios.ejercicio2.VariablesSimples;
import ejercicios.ejercicio3.EntradaUsuario;
import ejercicios.ejercicio4.OperacionesAritmeticas;
import ejercicios.ejercicio5.CaracteresEscape;
import ejercicios.ejercicio6.ExpresionesInstrucciones;
import ejercicios.ejercicio7.ConversionesTipo;
import ejercicios.ejercicio8.ErrorEjemploCorregido;
import ejercicios.ejercicio9.PruebaEscritorio;
import main.java.interfaces.Ejecutable;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            Ejecutable ejercicio = obtenerEjercicio(opcion);
            if (ejercicio != null) {
                ejercicio.ejecutar();
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
            if (opcion != 0) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }

        }
        while (opcion != 0);
        System.out.println("Chau!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=========================================");
        System.out.println("   Trabajo Práctico 1 - Introducción a Java");
        System.out.println("===========================================");
        System.out.println("1. Hola Mundo");
        System.out.println("2. Declaración de variables");
        System.out.println("3. Entrada de nombre y edad");
        System.out.println("4. Operaciones aritméticas");
        System.out.println("5. Caracteres de escape");
        System.out.println("6. Expresiones e instrucciones");
        System.out.println("7. Conversión de tipos");
        System.out.println("8. Corrección de error");
        System.out.println("9. Prueba de escritorio");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion () {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Ejecutable obtenerEjercicio(int opcion) {
        return switch (opcion) {
            case 1 -> new HolaMundo();
            case 2 -> new VariablesSimples();
            case 3 -> new EntradaUsuario();
            case 4 -> new OperacionesAritmeticas();
            case 5 -> new CaracteresEscape();
            case 6 -> new ExpresionesInstrucciones();
            case 7 -> new ConversionesTipo();
            case 8 -> new ErrorEjemploCorregido();
            case 9 -> new PruebaEscritorio();
           default -> null;
        };
    }
}
