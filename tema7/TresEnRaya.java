package tema7;

import java.util.Scanner;

public class TresEnRaya {

    public static final int TAM = 3;   // <-- CAMBIAR AQUÍ (4, 5, ...)
    public static char[][] tablero = new char[TAM][TAM];

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean fin = false;

        inicializarTablero();
        mostrarTablero();

        while (!fin) {

            jugadaJugador();
            mostrarTablero();

            if (hayGanador('X')) {
                System.out.println("¡Has ganado!");
                fin = true;
            } else if (tableroLleno()) {
                System.out.println("Empate.");
                fin = true;
            } else {

                jugadaOrdenador();
                mostrarTablero();

                if (hayGanador('O')) {
                    System.out.println("Ha ganado el ordenador.");
                    fin = true;
                }
            }
        }
    }

    // ---------------- MÉTODOS ----------------

    public static void inicializarTablero() {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero() {

        char letras='a';
        System.out.print("  ");
        for (int i = 1; i <= TAM; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < TAM; i++) {
            System.out.printf("%c",letras+i);
            for (int j = 0; j < TAM; j++) {
                System.out.print(tablero[i][j]);
                if (j < TAM - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static void jugadaJugador() {

        boolean correcta = false;
        int fila;
        int columna;
        String coord;

        while (!correcta) {

            System.out.print("Introduzca las coordenadas (ejemplo b2): ");
            coord = sc.nextLine().toLowerCase();

            fila = coord.charAt(0) - 'a';
            columna = coord.charAt(1) - '1';

            if (fila >= 0 && fila < TAM &&
                columna >= 0 && columna < TAM &&
                tablero[fila][columna] == ' ') {

                tablero[fila][columna] = 'X';
                correcta = true;
            }
        }
    }

    public static void jugadaOrdenador() {

        boolean puesta = false;
        int fila;
        int columna;

        while (!puesta) {
            fila =(int) (Math.random()*TAM);
            columna =(int) (Math.random()*TAM);

            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = 'O';
                puesta = true;
            }
        }
    }

    public static boolean hayGanador(char ficha) {

        boolean ganador = true;

        // Filas
        for (int i = 0; i < TAM; i++) {
            ganador = true;
            for (int j = 0; j < TAM; j++) {
                if (tablero[i][j] != ficha) {
                    ganador = false;
                }
            }
            if (ganador) {
                return true;
            }
        }

        // Columnas
        for (int j = 0; j < TAM; j++) {
            ganador = true;
            for (int i = 0; i < TAM; i++) {
                if (tablero[i][j] != ficha) {
                    ganador = false;
                }
            }
            if (ganador) {
                return true;
            }
        }

        // Diagonal principal
        ganador = true;
        for (int i = 0; i < TAM; i++) {
            if (tablero[i][i] != ficha) {
                ganador = false;
            }
        }

        if (ganador) {
            return true;
        }

        // Diagonal inversa
        ganador = true;
        for (int i = 0; i < TAM; i++) {
            if (tablero[i][TAM - 1 - i] != ficha) {
                ganador = false;
            }
        }

        return ganador;
    }

    public static boolean tableroLleno() {

        boolean lleno = true;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (tablero[i][j] == ' ') {
                    lleno = false;
                }
            }
        }

        return lleno;
    }
}
