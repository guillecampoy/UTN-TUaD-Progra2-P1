package ejercicios.ejercicio1;

import main.java.interfaces.Ejecutable;

public class HolaMundo implements Ejecutable {
    @Override
    public void ejecutar() {
        System.out.println("¡Hola Java!");
    }
}
