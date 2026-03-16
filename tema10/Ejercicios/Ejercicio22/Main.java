package tema10.Ejercicios.Ejercicio22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        int totalCapturas;
        int totalPeones = 0;
        Pieza item;
        ArrayList<Pieza> piezas = new ArrayList<>();

        // Creamos y guardamos las piezas junto a su cantidad y valor.
        piezas.add(new Pieza("Dama", 1, 9));
        piezas.add(new Pieza("Torre", 2, 5));
        piezas.add(new Pieza("Alfil", 2, 3));
        piezas.add(new Pieza("Caballo", 2, 2));
        piezas.add(new Pieza("Peón", 8, 1));

        // determinamos al azar cuantas capturas hace el jugador
        totalCapturas = (int) (Math.random()*16);

        while (totalCapturas > 0) {
            item = piezas.get( (int) (Math.random()*piezas.size()));
            if (item.puedoCapturar()) {
                item.capturar();
                totalPeones += item.getValor();
                System.out.println(item);
                totalCapturas--;
            }
        }
        

        System.out.printf("Puntos totales: %d peones\n",totalPeones);

    }
}
