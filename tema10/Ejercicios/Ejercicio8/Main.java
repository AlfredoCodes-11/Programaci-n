package tema10.Ejercicios.Ejercicio8;

import java.util.ArrayList;

import tema10.Ejercicios.Ejercicio8.clases.Carta;

public class Main {
    public static void main(String[] args) {
        
        Carta carta;
        ArrayList<Carta> baraja = new ArrayList<>();


        carta = new Carta();
        baraja.add(carta);

        for (int i=1; i<=10;i++){
            do {
                // Generamos una nueva carta
                carta = new Carta();
            } while(baraja.equals(baraja));
            // la añadimos a la baraja si no existe
            if (!baraja.contains(carta)) {
                baraja.add(carta);
            }
        }


        //mostrar todas las cartas
        for(Carta item: baraja){
            System.out.println(item);
        }
    }
}
