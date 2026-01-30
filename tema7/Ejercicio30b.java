package tema7;
import java.util.Scanner;

public class Ejercicio30b {

    // 🔧 TAMAÑO DEL TABLERO (CAMBIAR SOLO AQUÍ)
    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;

    // Valores del tablero
    public static final int VACIO = 0;
    public static final int JUGADOR = 1;
    public static final int MAQUINA = 2;

    public static int[][] tablero = new int[FILAS][COLUMNAS];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        inicializarTablero();
        boolean turnoJugador = true;

        while (true) {
            mostrarTablero();

            if (turnoJugador) {
                jugadaJugador();
                if (hayGanador(JUGADOR)) {
                    mostrarTablero();
<<<<<<< HEAD
                    System.out.println("¡Has ganado!");
=======
                    System.out.println("🎉 ¡Has ganado!");
>>>>>>> 540e64a2631859e7556953e944b6148d32f1b2c3
                    break;
                }
            } else {
                jugadaMaquina();
                if (hayGanador(MAQUINA)) {
                    mostrarTablero();
<<<<<<< HEAD
                    System.out.println("La máquina ha ganado.");
=======
                    System.out.println("🤖 La máquina ha ganado.");
>>>>>>> 540e64a2631859e7556953e944b6148d32f1b2c3
                    break;
                }
            }

            if (tableroLleno()) {
                mostrarTablero();
<<<<<<< HEAD
                System.out.println("Empate.");
=======
                System.out.println("🤝 Empate.");
>>>>>>> 540e64a2631859e7556953e944b6148d32f1b2c3
                break;
            }

            turnoJugador = !turnoJugador;
        }
    }

    static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }

    static void mostrarTablero() {
        System.out.print("  ");
        for (int i = 1; i <= COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < FILAS; i++) {
            System.out.print((char) ('a' + i) + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(simbolo(tablero[i][j]) + " ");
            }
            System.out.println();
        }
    }

    static char simbolo(int valor) {
        if (valor == JUGADOR) return 'X';
        if (valor == MAQUINA) return 'O';
        return '.';
    }

    static void jugadaJugador() {
        while (true) {
            System.out.print("Introduce coordenadas (ejemplo b2): ");
            String entrada = sc.nextLine().toLowerCase();

            if (entrada.length() < 2) {
                System.out.println("Entrada inválida.");
                continue;
            }

            int fila = entrada.charAt(0) - 'a';
            int columna = entrada.charAt(1) - '1';

            if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
                if (tablero[fila][columna] == VACIO) {
                    tablero[fila][columna] = JUGADOR;
                    break;
                } else {
                    System.out.println("Casilla ocupada.");
                }
            } else {
                System.out.println("Coordenadas fuera del tablero.");
            }
        }
    }

    static void jugadaMaquina() {
        int fila, columna;
        do {
            fila = (int) (Math.random()*FILAS);
            columna = (int) (Math.random()*COLUMNAS);
        } while (tablero[fila][columna] != VACIO);

        tablero[fila][columna] = MAQUINA;
        System.out.println("La máquina juega en " +
                (char) ('a' + fila) + (columna + 1));
    }

    static boolean hayGanador(int jugador) {

        // Filas
        for (int i = 0; i < FILAS; i++) {
            boolean gana = true;
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] != jugador) {
                    gana = false;
                    break;
                }
            }
            if (gana) return true;
        }

        // Columnas
        for (int j = 0; j < COLUMNAS; j++) {
            boolean gana = true;
            for (int i = 0; i < FILAS; i++) {
                if (tablero[i][j] != jugador) {
                    gana = false;
                    break;
                }
            }
            if (gana) return true;
        }

        // Diagonal principal
        boolean gana = true;
        for (int i = 0; i < FILAS; i++) {
            if (tablero[i][i] != jugador) {
                gana = false;
                break;
            }
        }
        if (gana) return true;

        // Diagonal secundaria
        gana = true;
        for (int i = 0; i < FILAS; i++) {
            if (tablero[i][COLUMNAS - 1 - i] != jugador) {
                gana = false;
                break;
            }
        }

        return gana;
    }

    static boolean tableroLleno() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
}

