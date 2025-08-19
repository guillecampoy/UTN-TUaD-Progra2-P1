package ejercicios.ejercicio2;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

public class VariablesSimples implements Ejecutable {
    @Override
    public void ejecutar() {
        String nombre = "Guillermo Campoy";
        int edad = 41;
        double altura = 1.83;
        boolean estudiante = true;

        // Resultados
        System.out.print("Nombre: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, nombre);
        System.out.print("Edad: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, edad +" años");
        System.out.print("Altura: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, altura +"m");
        System.out.print("Estudiante: ");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(estudiante));
    }
}
