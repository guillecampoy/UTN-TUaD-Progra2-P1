package main.java.ejercicio9;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

public class PruebaEscritorio implements Ejecutable {
    @Override
    public void ejecutar() {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);

        UtilsColor.imprimirEncabezado();
        System.out.println("| Línea | variable a   | variable b  | resultado   | \n" +
                "====================================================\n"+
                "|   9   | no definida  | no definida | no definida |\n" +
                "|   10  | int valor 5  | no definida | no definida |\n" +
                "|   11  | int valor 5  | int valor 2 | no definida |\n" +
                "|   12  | int valor 5  | int valor 2 | int valor 2 |\n" +
                "|   13  | int valor 5  | int valor 2 | int valor 2 |\n"+
                "====================================================");
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO, "Jistificación");
        System.out.println("Ambas variables son de tipo entero, se realiza la división entera,\n" +
                "descartando el resto y solo almacenando el valor entero, en este caso 2 ");
    }
}
