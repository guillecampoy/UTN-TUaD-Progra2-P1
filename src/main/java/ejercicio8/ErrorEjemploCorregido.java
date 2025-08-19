package main.java.ejercicio8;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

import java.util.Scanner;

public class ErrorEjemploCorregido implements Ejecutable {
    @Override
    public void ejecutar() {
        String bloqueConError;
        String lineaModificada;
        String explicacion;
        String lineaConError;

        bloqueConError = "import java.util.Scanner;\n" +
                "public class ErrorEjemplo {\n" +
                "public static void main(String[] args) {\n" +
                "Scanner scanner = new Scanner(System.in);\n" +
                "System.out.print(\"Ingresa tu nombre: \");\n" +
                "String nombre = scanner.nextInt(); // ERROR\n" +
                "System.out.println(\"Hola,\" + nombre);\n" +
                "}\n" +
                "}";
        lineaConError = "String nombre = scanner.nextInt();";
        lineaModificada = "String nombre = scanner.nextLine();";
        explicacion = "Hay una incompatibilidad entre el tipo de variable donde se almacena el valor\n" +
                "y la función utilizada para leer el valor en la clase Scanner\n" +
                "Lo correcto es modificar la línea a String nombre = scanner.nextLine()";

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirResultados(ContextColor.INFO, "Bloque de código ejemplo:");
        System.out.println(bloqueConError);
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO, "Corrección");
        System.out.println(lineaConError);
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, lineaModificada);
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, "Explicación");
        System.out.println(explicacion);
    }
}
