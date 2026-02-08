package Tema9.Ejercicios.Ejercicio4;

import Tema9.Ejercicios.Ejercicio4.clases.Fracciones;

public class Main {
    public static void main(String[] args) {

        Fracciones f2 = new Fracciones(3, 5);
        Fracciones f1 = new Fracciones(-910, 350);
        System.out.println(f1);
        f1.simplificar();
        //f1.invertir();

        System.out.println(f1);
        //System.out.println(f1.multiplicar(5));
        System.out.println(f1.multiplicar(f2));
        System.out.println(f1.division(f2));
        f1.simplificar();
    }
}
