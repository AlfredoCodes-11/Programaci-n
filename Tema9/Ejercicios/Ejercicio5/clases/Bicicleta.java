package Tema9.Ejercicios.Ejercicio5.clases;

public class Bicicleta extends Vehiculo {
    

    public void andaBici(int km) {
        System.out.println("La bicicleta anda " + km + " km\n");
        recorrer(km);
    }

    public void caballito() {
        System.out.println("Estoy haciendo el caballito\n");
    }

    public void hincharRuedas(){
        System.out.println("Hinchamos las dos ruedas.\n");
    }
}
