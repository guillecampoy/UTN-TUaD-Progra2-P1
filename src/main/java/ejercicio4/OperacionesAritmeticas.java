package main.java.ejercicio4;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

import java.util.Scanner;

public class OperacionesAritmeticas implements Ejecutable {
    @Override
    public void ejecutar() {
        int primerNumero, segundoNumero, suma, resta, multiplicacion;
        float division;

        Scanner scanner = new Scanner(System.in);

        //Calculos de operaciones básicos
        System.out.print("Ingrese el primer numero: ");
        primerNumero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        segundoNumero = scanner.nextInt();
        scanner.nextLine();
        suma = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        multiplicacion = primerNumero * segundoNumero;
        division = (float) primerNumero / segundoNumero;

        UtilsColor.imprimirEncabezado();
        System.out.print("Primer número ingresado: ");
        UtilsColor.imprimirResultados(ContextColor.INFO, String.valueOf(primerNumero));
        System.out.print("Segundo número ingresado: ");
        UtilsColor.imprimirResultados(ContextColor.INFO, String.valueOf(segundoNumero));
        System.out.print("Suma: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(suma));
        System.out.print("Resta: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(resta));
        System.out.print("Multiplicacion: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(multiplicacion));
        System.out.print("Division: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(division));
    }
}
