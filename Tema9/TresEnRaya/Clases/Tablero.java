package Tema9.TresEnRaya.Clases;

public class Tablero {
    private int tam;
    private char[][] tablero;

    public Tablero(int tam) {
        this.tam = tam;
        tablero = new char[tam][tam];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++)
                tablero[i][j] = ' ';
    }

    public void mostrar() {

        char letras = 'a';

        System.out.print("  ");
        for (int i = 1; i <= tam; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < tam; i++) {
            System.out.print((char)(letras + i));
            for (int j = 0; j < tam; j++) {
                System.out.print(tablero[i][j]);
                if (j < tam - 1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean colocarFicha(int fila, int columna, char ficha) {
        if (fila >= 0 && fila < tam &&
            columna >= 0 && columna < tam &&
            tablero[fila][columna] == ' ') {

            tablero[fila][columna] = ficha;
            return true;
        }
        return false;
    }

    public boolean hayGanador(char ficha) {

        boolean lineaCompleta;

        // Filas
        for (int i = 0; i < tam; i++) {
            lineaCompleta = true;
            for (int j = 0; j < tam; j++)
                if (tablero[i][j] != ficha)
                    lineaCompleta = false;

            if (lineaCompleta) return true;
        }

        // Columnas
        for (int j = 0; j < tam; j++) {
            lineaCompleta = true;
            for (int i = 0; i < tam; i++)
                if (tablero[i][j] != ficha)
                    lineaCompleta = false;

            if (lineaCompleta) return true;
        }

        // Diagonal principal
        lineaCompleta = true;
        for (int i = 0; i < tam; i++)
            if (tablero[i][i] != ficha)
                lineaCompleta = false;

        if (lineaCompleta) return true;

        // Diagonal secundaria
        lineaCompleta = true;
        for (int i = 0; i < tam; i++)
            if (tablero[i][tam - 1 - i] != ficha)
                lineaCompleta = false;

        return lineaCompleta;
    }

    public boolean estaLleno() {
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++)
                if (tablero[i][j] == ' ')
                    return false;

        return true;
    }

    public int getTam() {
        return tam;
    }
}
