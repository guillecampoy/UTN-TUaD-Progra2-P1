package ejercicios.ejercicio6;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

public class ExpresionesInstrucciones implements Ejecutable {
    @Override
    public void ejecutar() {
        String linea1 = "int x = 10; // Línea 1";
        String linea2 = "x = x + 5; // Línea 2";
        String linea3 = "System.out.println(x); // Línea 3";

        //Salida
        UtilsColor.imprimirEncabezado();

        UtilsColor.imprimirResultados(ContextColor.INFO, "Dadas las siguientes líneas indicar si es expresión o instrucción:");
        System.out.println();
        System.out.println(linea1 + "\n" + linea2 + "\n" + linea3);
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO, "En todos los casos se pueden ver instrucciones" +
                "\nInstrucciones: Es una acción que el programa ejecuta, por ejemplo una asignación, el propósito es \"hacer algo\"" +
                "\nExpresión: Es una porción de código o fragmento que produce un resultado x+5, por ejemplo" +
                "\nResumiendo, las expresiones generan valores, las instrucciones generan efectos en el programa.");
    }
}
