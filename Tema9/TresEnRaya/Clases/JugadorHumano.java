package Tema9.TresEnRaya.Clases;

import java.util.Scanner;

public class JugadorHumano extends Jugador {
    private Scanner sc = new Scanner(System.in);

    public JugadorHumano(char ficha) {
        super(ficha);
    }

    @Override
    public void jugar(Tablero tablero) {

        boolean correcta = false;

        while (!correcta) {

            System.out.print("Introduzca las coordenadas (ejemplo b2): ");
            String coord = sc.nextLine().toLowerCase();

            int fila = coord.charAt(0) - 'a';
            int columna = coord.charAt(1) - '1';

            correcta = tablero.colocarFicha(fila, columna, ficha);
        }
    }
}
