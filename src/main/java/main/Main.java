package main.java.main;

import main.java.ejercicio1.HolaMundo;
import main.java.ejercicio2.VariablesSimples;
import main.java.ejercicio3.EntradaUsuario;
import main.java.ejercicio4.OperacionesAritmeticas;
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
           // case 5 -> new ejercicio5.CaracteresEscape();
           // case 6 -> new ejercicio6.ExpresionesInstrucciones();
           // case 7 -> new ejercicio7.ConversionesTipo();
           // case 8 -> new ejercicio8.ErrorEjemploCorregido();
           // case 9 -> new ejercicio9.PruebaEscritorio();
           default -> null;
        };
    }
}
