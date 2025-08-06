package main.java.ejercicio3;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

import java.util.Scanner;

public class EntradaUsuario implements Ejecutable {
    @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        UtilsColor.imprimirEncabezado();
        System.out.print("Nombre: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS,nombre);
        System.out.print("Edad: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS,edad+" años");
    }
}
