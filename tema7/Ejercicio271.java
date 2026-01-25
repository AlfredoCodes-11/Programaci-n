package tema7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio271 {


    public static final int FILAS = 4;
    public static final int COLUMNAS = 5;


    public static int[][] tablero;
    public static int minaX, minaY;
    public static int tesoroX, tesoroY;
    public static boolean encontrado;
    public static boolean perdido;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        tablero = new int[FILAS][COLUMNAS];
        encontrado = false;
        perdido = false;


        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = 0;
            }
        }


        minaX = (int)(Math.random()*COLUMNAS);
        minaY = (int)(Math.random()*FILAS);

        do {
            tesoroX = (int)(Math.random()*COLUMNAS);
            tesoroY = (int)(Math.random()*FILAS);
        } while (tesoroX == minaX && tesoroY == minaY);

        System.out.println("¡BUSCA EL TESORO!");

        while (!encontrado && !perdido) {

            mostrarTablero(false);

            System.out.print("Coordenada x: ");
            x = sc.nextInt();

            System.out.print("Coordenada y: ");
            y = sc.nextInt();

            if (x < 0 || x >= COLUMNAS || y < 0 || y >= FILAS) {
                System.out.println("Coordenadas fuera del tablero.");
            }

            tablero[y][x] = 1; 

            if (x == tesoroX && y == tesoroY) {
                encontrado = true;
                System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
            } else if (x == minaX && y == minaY) {
                perdido = true;
                System.out.println("¡BOOM! Lo siento, has perdido.");
            }
        }

        tablero[minaY][minaX] = 2;
        tablero[tesoroY][tesoroX] = 3;

        mostrarTablero(true);

        sc.close();
    }

    public static void mostrarTablero(boolean mostrarTodo) {

        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + " | ");
            for (int j = 0; j < COLUMNAS; j++) {

                if (!mostrarTodo && tablero[i][j] != 1) {
                    System.out.print("  ");
                } else {
                    switch (tablero[i][j]) {
                        case 0: 
                            System.out.print("  "); 
                            break;
                        case 1: 
                            System.out.print("X "); 
                        break;
                        case 2: 
                            System.out.print("M "); 
                        break;
                        case 3: 
                            System.out.print("T "); 
                        break;
                    }
                }
            }
            System.out.println();
        }

        System.out.print("    ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print("--");
        }
        System.out.println();

        System.out.print("     ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
