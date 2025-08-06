package main.java.utils;

public class UtilsColor {
    // Se define esta clase utilitaria que permite establecer algunos colores básicos
    // basados en un contexto que se envía como parte de los argumentos

    private static final String RESET = "\u001B[0m";
    private static final String VERDE = "\u001B[32m";
    private static final String ROJO = "\u001B[31m";
    private static final String AMARILLO = "\u001B[33m";
    private static final String AZUL = "\u001B[34m";
    private static final String BLANCO = "\u001B[37m";

    public static void imprimirResultados(ContextColor contexto, String mensaje) {
        String color;

        switch (contexto) {
            case SUCCESS -> color = VERDE;
            case ERROR -> color = ROJO;
            case WARNING -> color = AMARILLO;
            case INFO -> color = AZUL;
            case DEFAULT -> color = BLANCO;
            default -> color = RESET;
        }

        System.out.println(color + mensaje + RESET);

    }

    public static void imprimirEncabezado() {
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO,"======Resultados======");
    }
}

