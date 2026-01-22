package tema7;

import java.util.Scanner;

    public class Ejercicio13 {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            final int MAXIMOFILA=3;
            final int MAXIMOCOLUMNA=3;

            boolean salir = false;
            

            int filas;
            int columnas;
            int totalElementos;

            int[][] tabla = {
                { 8, -12, 33 },
                { 14, 1, -24 },
                { 100, 51, 69 }
            };

            int posicion;

           

                System.out.print("Introduce el elemento a visualizar (0 - 8): ");
                posicion = sc.nextInt();


                

                filas = MAXIMOFILA;
                columnas = MAXIMOCOLUMNA;
                totalElementos = filas * columnas;

                if (posicion >= 0 && posicion < totalElementos) {

                    filas = posicion / columnas;
                    columnas = posicion % columnas;

                    System.out.println("Elemento " + posicion + " = " + tabla[filas][columnas]);

                    } else {
                       System.out.println("Posición fuera de rango.");
                    }
                
            

            sc.close();
        }
    

        
}
