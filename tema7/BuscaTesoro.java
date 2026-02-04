package tema7;

import java.util.Scanner;

public class BuscaTesoro {

    // CONSTANTES
    static final int FILAS = 4;
    static final int COLUMNAS = 5;

    // VARIABLES
    static char[][] tablero;
    static int minaX, minaY;
    static int tesoroX, tesoroY;
    static boolean encontrado;
    static boolean perdido;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        tablero = new char[FILAS][COLUMNAS];
        encontrado = false;
        perdido = false;

        inicializarTablero();
        generarMinaYTesoro();

        System.out.println("¡BUSCA EL TESORO!");

        while (!encontrado && !perdido) {

            mostrarTablero(false);

            System.out.print("Coordenada x: ");
            int x = sc.nextInt();

            System.out.print("Coordenada y: ");
            int y = sc.nextInt();

            if (coordenadaValida(x, y)) {
                comprobarJugada(x, y);
            } else {
                System.out.println("Coordenadas fuera del tablero.");
            }
        }

        colocarFinal();
        System.out.println("\nTABLERO FINAL:");
        mostrarTablero(true);

        sc.close();
    }

    // INICIALIZA EL TABLERO
    static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // GENERA POSICIONES ALEATORIAS CON Math.random()
    static void generarMinaYTesoro() {

        minaX = (int) (Math.random() * COLUMNAS);
        minaY = (int) (Math.random() * FILAS);

        do {
            tesoroX = (int) (Math.random() * COLUMNAS);
            tesoroY = (int) (Math.random() * FILAS);
        } while (tesoroX == minaX && tesoroY == minaY);
    }

    // COMPRUEBA SI LA COORDENADA ES VÁLIDA
    static boolean coordenadaValida(int x, int y) {
        boolean valida = false;

        if (x >= 0 && x < COLUMNAS && y >= 0 && y < FILAS) {
            valida = true;
        }

        return valida;
    }

    // COMPRUEBA LA JUGADA
    static void comprobarJugada(int x, int y) {

        tablero[y][x] = 'X';

        if (x == tesoroX && y == tesoroY) {
            encontrado = true;
            System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
        } else if (x == minaX && y == minaY) {
            perdido = true;
            System.out.println("¡BOOM! Has encontrado la mina. Has perdido.");
        }
    }

    // COLOCA MINA Y TESORO AL FINAL
    static void colocarFinal() {
        tablero[minaY][minaX] = 'M';
        tablero[tesoroY][tesoroX] = 'T';
    }

    // MUESTRA EL TABLERO
    static void mostrarTablero(boolean mostrarTodo) {

        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + " | ");
            for (int j = 0; j < COLUMNAS; j++) {

                if (!mostrarTodo && tablero[i][j] != 'X') {
                    System.out.print("  ");
                } else {
                    System.out.print(tablero[i][j] + " ");
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
        System.out.println();
    }
}

