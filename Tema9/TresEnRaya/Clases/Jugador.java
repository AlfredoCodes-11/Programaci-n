package Tema9.TresEnRaya.Clases;

public abstract class Jugador {
    protected char ficha;

    public Jugador(char ficha) {
        this.ficha = ficha;
    }

    public char getFicha() {
        return ficha;
    }

    public abstract void jugar(Tablero tablero);
}
