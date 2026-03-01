package Tema9.TresEnRaya.Clases;

public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego(int tam) {
        tablero = new Tablero(tam);
        jugador1 = new JugadorHumano('X');
        jugador2 = new JugadorOrdenador('O');
    }

    public void iniciar() {

        boolean fin = false;
        tablero.mostrar();

        while (!fin) {

            jugador1.jugar(tablero);
            tablero.mostrar();

            if (tablero.hayGanador(jugador1.getFicha())) {
                System.out.println("¡Has ganado!");
                fin = true;
            } else if (tablero.estaLleno()) {
                System.out.println("Empate.");
                fin = true;
            } else {

                jugador2.jugar(tablero);
                tablero.mostrar();

                if (tablero.hayGanador(jugador2.getFicha())) {
                    System.out.println("Ha ganado el ordenador.");
                    fin = true;
                }
            }
        }
    }
}
