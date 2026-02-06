package Tema9.Ejercicios.Ejercicio3;

import Tema9.Ejercicios.Ejercicio3.clases.Canarios;
import Tema9.Ejercicios.Ejercicio3.clases.Gato;
import Tema9.Ejercicios.Ejercicio3.clases.Pinguino;

public class Main {
    
    public static void main(String[] args) {
        Gato garfield = new Gato("Garfield");
        Canarios piolin = new Canarios("Piolin");
        Pinguino berny = new Pinguino("Berny");
        
        garfield.maulla();
        piolin.piar();
    }
    
}
