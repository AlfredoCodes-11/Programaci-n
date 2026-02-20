package tema10.ObjetosArray.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Disco disc1 = new Disco("232DS", "DTMF","Paco", "Rock", 348);


        ColeccionDisco lista = new ColeccionDisco();

        lista.añadirDisco(disc1);
        lista.mostrarDisco();
    }
}
