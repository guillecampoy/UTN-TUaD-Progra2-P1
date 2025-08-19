package ejercicios.ejercicio7;

import main.java.interfaces.Ejecutable;
import main.java.utils.ContextColor;
import main.java.utils.UtilsColor;

import java.util.Scanner;

public class ConversionesTipo implements Ejecutable {
    @Override
    public void ejecutar() {
        // Definicion variables auxiliares
        Scanner scanner = new Scanner(System.in);
        int divisionEntera;
        double divisionDoble;

        System.out.println("Ingrese valores para división con ingreso de variables de tipo integrer");
        System.out.print("Ingrese primer número: ");
        int primerNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese segundo numero: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());
        divisionEntera = primerNumero / segundoNumero;

        System.out.println("Ingrese valores para división con ingreso de variables de tipo double");
        System.out.print("Ingrese primer número: ");
        double primerNumeroDouble = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese segundo numero: ");
        double segundoNumeroDouble = Integer.parseInt(scanner.nextLine());
        divisionDoble = primerNumeroDouble / segundoNumeroDouble;

        UtilsColor.imprimirEncabezado();
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO, "División variable entera");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(divisionEntera));
        System.out.println();
        UtilsColor.imprimirResultados(ContextColor.INFO, "División variable double");
        UtilsColor.imprimirResultados(ContextColor.SUCCESS, String.valueOf(divisionDoble));
        System.out.println();
        System.out.println("La diferencia que vemos entre usar diferentes tipos de variables" +
                "\nes una diferencia en cuanto a la precisión de los resultados" +
                "\nes un dato relevante ya que el sistema no tiene el contexto de si se puede o no despreciar el resto" +
                "\nreforzando que es importante el entendimiento de que representa el resultado y expresarlo con la presición correspondiente según sea el caso");
    }
}
