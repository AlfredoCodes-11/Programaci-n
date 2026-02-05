package Tema9.Ejercicios.Ejercicio2;

import Tema9.Ejercicios.Ejercicio2.clases.Caballo;

public class Main {
    public static void main(String[] args) {
        
        Caballo babieca = new Caballo("Babieca");
        Caballo lykos = new Caballo("Lykos");

        System.out.println("Hola, me llamo "+ babieca.getNombre());
        babieca.galopa();
        babieca.relinchar();

        System.out.println("Hola, me llamo "+ lykos.getNombre());
        lykos.come();
        lykos.galopa();
        
    }
}
