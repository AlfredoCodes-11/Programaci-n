package tema8.matematicas;

import tema8.matematicas.Funciones;

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <1001; i++) {
            if (Funciones.esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
