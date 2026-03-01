package Tema9.TresEnRaya.Clases;

public class JugadorOrdenador extends Jugador {
    public JugadorOrdenador(char ficha) {
        super(ficha);
    }

    @Override
    public void jugar(Tablero tablero) {

        boolean puesta = false;

        while (!puesta) {
            int fila = (int) (Math.random() * tablero.getTam());
            int columna = (int) (Math.random() * tablero.getTam());

            puesta = tablero.colocarFicha(fila, columna, ficha);
        }
    }
}
