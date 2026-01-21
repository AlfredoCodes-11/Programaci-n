package tema7;

import java.util.Scanner;

    public class Ejercicio13 {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            boolean salir = false;

            int[][] tabla = {
                { 8, -12, 33 },
                { 14, 1, -24 },
                { 100, 51, 69 }
            };

            int posicion;

            while (!salir) {

                System.out.print("\nIntroduce el elemento a visualizar (-1 para salir): ");
                posicion = sc.nextInt();

                if (posicion == -1) {
                    salir = true;
                    System.out.println("Programa finalizado.");
                }

                if (!salir) {

                    int filas = tabla.length;
                    int columnas = tabla[0].length;
                    int totalElementos = filas * columnas;

                    if (posicion >= 0 && posicion < totalElementos) {

                        int fila = posicion / columnas;
                        int columna = posicion % columnas;

                        System.out.println("Elemento " + posicion + " = " + tabla[fila][columna]);

                    } else {
                       System.out.println("Posición fuera de rango.");
                    }
                }
            }

            sc.close();
        }
    

        
}
