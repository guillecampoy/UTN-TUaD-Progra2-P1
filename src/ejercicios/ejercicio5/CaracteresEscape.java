package ejercicios.ejercicio5;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

public class CaracteresEscape implements Ejecutable {
    @Override
    public void ejecutar() {
        // Definición de variables
        String mensaje;

        // Asignación
        mensaje = "Nombre: Juan Pérez \nEdad: 30 años \nDirección: \"Calle Falsa 123\"";

        //Salida
        UtilsColor.imprimirEncabezado();

        // Salida formateada
        UtilsColor.imprimirResultados(ContextColor.INFO, "Salida Formateada");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS,mensaje);
        // Salida plana
        System.out.println();
        System.out.println("Salida Plana:");
        System.out.println(mensaje);
    }
}
